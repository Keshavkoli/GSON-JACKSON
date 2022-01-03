package com.writejsonfileinjavabygson;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jsontojavaobject.jackson.SchoolAddress;
import com.jsontojavaobject.jackson.SchoolInfo;
import com.jsontojavaobject.jackson.Student;

public class WriteJsonFileInJavaByGson {

	public static void main(String[] args) {

		writeFile(new Student("keshav", "koli", 22, new SchoolInfo("Vidyanchal-school", "Kavita-miss", "Aarti-patil",
				new SchoolAddress("pune", "Banar", "Maharashrta", 411003))));
	}

	private static void writeFile(Student student) {
		// Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		try {
			FileWriter writer = new FileWriter("E:\\Keshav\\Xangars_Workspace\\Student\\staff.json");
			// In here we have given the object with object of writer
			gson.toJson(student, writer);
			if (writer != null) {
				System.out.println("writer successfull");
			} else {
				System.out.println("writer not successful");
			}
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
