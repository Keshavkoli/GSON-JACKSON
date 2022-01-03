package com.writejsonfileinjavabyjackson;

import java.io.FileWriter;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsontojavaobject.jackson.SchoolAddress;
import com.jsontojavaobject.jackson.SchoolInfo;
import com.jsontojavaobject.jackson.Student;

public class WriteJsonFileInJavaByJackson {

	public static void main(String[] args) {

		writeFileByJackson(new Student("keshav", "koli", 22, new SchoolInfo("Vidyanchal-school", "Kavita-miss",
				"Aarti-patil", new SchoolAddress("pune", "Banar", "Maharashrta", 411003))));
	}

	private static void writeFileByJackson(Student student) {
		ObjectMapper mapper = new ObjectMapper();

		try {
			FileWriter writer = new FileWriter("E:\\\\Keshav\\\\Xangars_Workspace\\\\Student\\\\material.json");
			mapper.writeValue(writer, student);
			if (writer != null) {
				System.out.println("writer successfull");
			} else {
				System.out.println("writer not successful");
			}
			writer.close();
			System.out.println("the write value is written here ===>" + writer);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student));
			System.out.println(mapper);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
