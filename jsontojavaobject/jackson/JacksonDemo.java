package com.jsontojavaobject.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {

	public static void main(String[] args) {

		getJson(new Student("keshav", "koli", 22, new SchoolInfo("Vidyanchal-school", "Kavita-miss", "Aarti-patil",
				new SchoolAddress("pune", "Banar", "Maharashrta", 411003))));

	}

	private static void getJson(Student student) {
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			// json = mapper.writeValueAsString(student);
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);// it will print it pretty
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("------- Here we have printed pojo to json-------");
		System.out.println(json);
		getObject(json);
	}

	private static void getObject(String json) {
		System.out.println("----------- Json to java Object-----------");
		ObjectMapper map = new ObjectMapper();
		Student student = null;
		try {
			student = map.readValue(json, Student.class);// we have to use String content and type class
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(student);
		System.out.println(student.getName());
		System.out.println(student.getSurname());
		System.out.println(student.getAge());
		System.out.println(student.getMember().getPrincipleName());
		System.out.println(student.getMember().getSchoolName());
		System.out.println(student.getMember().getTeacherName());
		System.out.println(student.getMember().getAddress().getCity());
		System.out.println(student.getMember().getAddress().getStreet());
		System.out.println(student.getMember().getAddress().getState());
		System.out.println(student.getMember().getAddress().getPincode());
	}

}
