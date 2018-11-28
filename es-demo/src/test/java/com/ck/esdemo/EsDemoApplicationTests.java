package com.ck.esdemo;

import com.ck.esdemo.domain.es.User;
import com.ck.esdemo.repository.UserRepository;
import com.google.common.base.Joiner;
import org.assertj.core.util.Lists;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.index.query.QueryStringQueryBuilder;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.core.query.IndexQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EsDemoApplicationTests {

	@Autowired
	UserRepository userRepository;

	@Autowired
	ElasticsearchTemplate elasticsearchTemplate;

	private String[] firstName = {"张", "李","赵"};

	@Test
	public void contextLoads() {
	}

	@Test
	public void query() {
		BoolQueryBuilder query = new BoolQueryBuilder();
		query.must(QueryBuilders.fuzzyQuery("realName","金"));
		query.must(new QueryStringQueryBuilder("king").field("userName"));
		FieldSortBuilder sortBuilder = SortBuilders.fieldSort("age").order(SortOrder.ASC);
		PageRequest page = PageRequest.of(0, 2);
		NativeSearchQueryBuilder nativeSearchQueryBuilder = new NativeSearchQueryBuilder();
		nativeSearchQueryBuilder.withQuery(query);
		nativeSearchQueryBuilder.withPageable(page);
		nativeSearchQueryBuilder.withSort(sortBuilder);
		NativeSearchQuery nativeSearchQuery = nativeSearchQueryBuilder.build();

		Page<User> userPage = userRepository.search(nativeSearchQuery);
		System.out.println("结果-----------");
		System.out.println(userPage);
	}

	@Test
	public void add() {
		User.Builder builder = User.newBuilder().age(10).realName("test").userName("testName");
		User user = User.newBuilder().id(1L).age(10).realName("test").userName("testName").build();
		List<User> list = Lists.newArrayList();
		list.add(user);
		list.add(builder.build());
		userRepository.saveAll(list);
	}

	@Test
	public void loopAdd() {
		IntStream.range(1,10000).forEach(i->{
			User user = User.newBuilder().id(Long.valueOf(i)).age(10).realName("test").userName("testName").build();
//			userRepository.save(user);
		});
	}

	@Test
	public void bulkIndexTest() {
		List<IndexQuery> collect = IntStream.range(1, 100000).mapToObj(i -> {
			User user = User.newBuilder().id(Long.valueOf(i)).age(10).realName("test").userName("testName").build();
			IndexQuery indexQuery = new IndexQuery();
			indexQuery.setId(i + "");
			indexQuery.setObject(user);
			indexQuery.setType("user");
			indexQuery.setIndexName("test");
			return indexQuery;
		}).collect(Collectors.toList());
		elasticsearchTemplate.bulkIndex(collect);

	}

	@Test
	public void delIndex() {
		userRepository.deleteAll();

	}

}
