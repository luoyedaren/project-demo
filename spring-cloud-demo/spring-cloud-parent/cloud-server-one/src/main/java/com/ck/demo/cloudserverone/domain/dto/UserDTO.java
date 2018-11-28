package com.ck.demo.cloudserverone.domain.dto;

import lombok.Data;

/**
 * project spring-cloud-parent
 *
 * @author chenghai on 2018/10/25 0025. - 星期四
 * nickName louyedaren
 * 流式编程
 */
@Data
public class UserDTO {
	private String name;
	private int age;

	private UserDTO(Builder builder) {
		setName(builder.name);
		setAge(builder.age);
	}

	public static Builder newBuilder() {
		return new Builder();
	}

	public static Builder newBuilder(UserDTO copy) {
		Builder builder = new Builder();
		builder.name = copy.getName();
		builder.age = copy.getAge();
		return builder;
	}

	/**
	 * {@code UserDTO} builder static inner class.
	 */
	public static final class Builder {
		private String name;
		private int age;

		private Builder() {
		}

		/**
		 * Sets the {@code name} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code name} to set
		 * @return a reference to this Builder
		 */
		public Builder name(String val) {
			name = val;
			return this;
		}

		/**
		 * Sets the {@code age} and returns a reference to this Builder so that the methods can be chained together.
		 *
		 * @param val the {@code age} to set
		 * @return a reference to this Builder
		 */
		public Builder age(int val) {
			age = val;
			return this;
		}

		/**
		 * Returns a {@code UserDTO} built from the parameters previously set.
		 *
		 * @return a {@code UserDTO} built with parameters of this {@code UserDTO.Builder}
		 */
		public UserDTO build() {
			return new UserDTO(this);
		}
	}

	public static void main(String[] args) {
		UserDTO hello = UserDTO.newBuilder().name("hello").age(10).build();
		System.out.println(hello);

		UserDTO userDTO = UserDTO.newBuilder().build();
		userDTO.setAge(2);
		userDTO.setName("mike");

		System.out.println(userDTO);

	}
}
