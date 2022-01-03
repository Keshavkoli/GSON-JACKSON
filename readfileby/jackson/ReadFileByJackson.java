package com.readfileby.jackson;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jsontojavaobject.jackson.Student;

public class ReadFileByJackson {

	public static void main(String[] args) {
		// Read fields from Json file
		readfile("E:\\Keshav\\Xangars_Workspace\\Student\\student.json");
		// the below readfile is used for the list type of json
		// readfile("E:\\Keshav\\Xangars_Workspace\\Student\\student_list.json");
	}

	private static void readfile(String fileAddress) {
		ObjectMapper mapper = new ObjectMapper();
		String json = null;
		try {
			Student student = mapper.readValue(new FileReader(fileAddress), Student.class);
			// we can use List values also in json in the below method
			// User [] user = mapper.readValue(new FileReader(fileAddress),
			// Student[].class);
			System.out.println(mapper.writeValueAsString(student));// In Here it has covered all the fields
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student);
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(student));// it is used for
																									// prety printing
		} catch (StreamReadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DatabindException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
