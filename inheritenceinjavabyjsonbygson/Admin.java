package com.inheritenceinjavabyjsonbygson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin extends Employee {
	private String username;
	private String password;

	public Admin(String firstName, String lastName, Integer age, AddressInfo addressinfo, String username,
			String password) {
		super(EmployeeType.ADMIN, firstName, lastName, age, null);
		setUsername(username);
		setPassword(password);
	}

}
