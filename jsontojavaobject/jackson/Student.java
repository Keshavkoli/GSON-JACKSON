package com.jsontojavaobject.jackson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	private String name;
	private String surname;
	private Integer age;
	private SchoolInfo member;
}
