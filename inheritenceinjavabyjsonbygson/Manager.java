package com.inheritenceinjavabyjsonbygson;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class Manager extends Employee {

	private String post;

	public Manager(String firstName, String lastName, Integer age, AddressInfo addressinfo, String post) {
		super(EmployeeType.MANAGER, firstName, lastName, age, null);
		setPost(post);
	}
}
