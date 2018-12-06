package com.ck.labs.vue.spring.boot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;

/**
 * project vue-spring-boot
 *
 * @author chenghai on 2018/12/6 0006. - 星期四
 * nickName louyedaren
 */
@RepositoryRestResource
public interface TodoRepository extends JpaRepository<Todo, Long> {


}
