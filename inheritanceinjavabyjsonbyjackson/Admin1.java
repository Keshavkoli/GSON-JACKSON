package com.inheritanceinjavabyjsonbyjackson;

import com.inheritenceinjavabyjsonbygson.AddressInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin1 extends Company {
	private String username;
	private String password;

	public Admin1(String firstName, String lastName, Integer age, AddressInfo addressinfo, String username,
			String password) {
		super(CompanyType.ADMIN1, firstName, lastName, age, null);
		setUsername(username);
		setPassword(password);
	}
}
