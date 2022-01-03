package com.readfilebygson;

import java.io.FileNotFoundException;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.jsontojavaobject.jackson.Student;

public class ReadFileByGsonDemo {

	public static void main(String[] args) {
		// Read fields from file
		readfile("E:\\Keshav\\Xangars_Workspace\\Student\\student.json");
		// if we want to use it in List we can use it with below method
		// readfile("E:\\Keshav\\Xangars_Workspace\\Student\\student_list.json");

		// In here its the Address of file and file name
		// here we can read json from a file
	}

	private static void readfile(String fileAddress) {

		Gson gson = new Gson();
		Gson ason = new GsonBuilder().setPrettyPrinting().create();
		try {
			Student student = gson.fromJson(new FileReader(fileAddress), Student.class);
			Student student1 = ason.fromJson(new FileReader(fileAddress), Student.class);//it is used for pretty printing
			//  if we have list in json we can use the below method
			// Student [] student = gson.fromJson(new FileReader(fileAddress),Student.class);

			System.out.println(gson.toJson(student));// In Here it has not covered all the fields
			System.out.println(ason.toJson(student1));
		} catch (JsonSyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonIOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
