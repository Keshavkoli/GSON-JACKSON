package com.inheritenceinjavabyjsonbygson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	private EmployeeType employeeType;
	private String firstName;
	private String lastName;
	private Integer age;
	private AddressInfo addressinfo;
}
