package com.inheritanceinjavabyjsonbyjackson;

import com.inheritenceinjavabyjsonbygson.AddressInfo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 
public class Manager1 extends Company {
	private String post;

	public Manager1(String firstName, String lastName, Integer age, AddressInfo addressinfo, String post) {
		super(CompanyType.MANAGER1, firstName, lastName, age, null);
		setPost(post);
	}
}
