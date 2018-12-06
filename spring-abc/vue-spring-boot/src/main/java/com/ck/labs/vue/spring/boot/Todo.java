package com.ck.labs.vue.spring.boot;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * project vue-spring-boot
 *
 * @author chenghai on 2018/12/6 0006. - 星期四
 * nickName louyedaren
 */
@Entity
@Data
@NoArgsConstructor
public class Todo {
	@Id
	@GeneratedValue
	private Long id;

	@NonNull
	private String title;

	private Boolean completed = false;


}
