package com.ck.esdemo.domain.es;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.time.LocalDateTime;

/**
 * project es-demo
 *
 * @author chenghai on 2018/10/31 0031. - 星期三
 * nickName louyedaren
 */
@Data
@Document(indexName = "shop",type = "user" ,refreshInterval = "0s")
public class User {
	@Id
	private Long id;

	private String userName;

	private String realName;

	private String password;

	private Integer age;

	//这三个注解是为了前台序列化java8 LocalDateTime使用的，需要引入jsr310的包才可以使用
	@JsonSerialize(using = LocalDateTimeSerializer.class)
	@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm")
	private LocalDateTime birth;

	private User(Builder builder) {
		setId(builder.id);
		setUserName(builder.userName);
		setRealName(builder.realName);
		setPassword(builder.password);
		setAge(builder.age);
		setBirth(builder.birth);
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static Builder newBuilder(User copy) {
		Builder builder = new Builder();
		builder.id = copy.getId();
		builder.userName = copy.getUserName();
		builder.realName = copy.getRealName();
		builder.password = copy.getPassword();
		builder.age = copy.getAge();
		builder.birth = copy.getBirth();
		return builder;
	}

	/**
	 * {@code User} builder static inner class.
	 */
	public static final class Builder {
		private Long id;
		private String userName;
		private String realName;
		private String password;
		private Integer age;
		private LocalDateTime birth;

		private Builder() {
		}

		/**
		 * Sets the {@code id} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code id} to set
		 * @return a reference to this Builder
		 */
		public Builder id(Long val) {
			id = val;
			return this;
		}

		/**
		 * Sets the {@code userName} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code userName} to set
		 * @return a reference to this Builder
		 */
		public Builder userName(String val) {
			userName = val;
			return this;
		}

		/**
		 * Sets the {@code realName} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code realName} to set
		 * @return a reference to this Builder
		 */
		public Builder realName(String val) {
			realName = val;
			return this;
		}

		/**
		 * Sets the {@code password} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code password} to set
		 * @return a reference to this Builder
		 */
		public Builder password(String val) {
			password = val;
			return this;
		}

		/**
		 * Sets the {@code age} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code age} to set
		 * @return a reference to this Builder
		 */
		public Builder age(Integer val) {
			age = val;
			return this;
		}

		/**
		 * Sets the {@code birth} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code birth} to set
		 * @return a reference to this Builder
		 */
		public Builder birth(LocalDateTime val) {
			birth = val;
			return this;
		}

		/**
		 * Returns a {@code User} built from the parameters previously set.
		 *
		 * @return a {@code User} built with parameters of this {@code User.Builder}
		 */
		public User build() {
			return new User(this);
		}
	}
}
