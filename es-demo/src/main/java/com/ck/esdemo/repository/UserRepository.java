package com.ck.esdemo.repository;

import com.ck.esdemo.domain.es.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * project es-demo
 *
 * @author chenghai on 2018/10/31 0031. - 星期三
 * nickName louyedaren
 */
public interface UserRepository extends ElasticsearchRepository<User,Long> {

}
