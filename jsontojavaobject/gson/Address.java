package com.jsontojavaobject.gson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	private String city;
	private String street;
	private Integer pincode;
	private String state;
}
