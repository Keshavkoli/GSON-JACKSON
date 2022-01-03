package com.jsontojavaobject.jackson;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SchoolInfo {
	
	private String SchoolName;
	private String TeacherName;
	private String PrincipleName;
	private SchoolAddress address;
	
	
}
