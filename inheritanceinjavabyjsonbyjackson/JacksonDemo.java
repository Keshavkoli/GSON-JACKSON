package com.inheritanceinjavabyjsonbyjackson;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.inheritenceinjavabyjsonbygson.AddressInfo;

public class JacksonDemo {
	public static void main(String[] args) {
		List<Company> company = new ArrayList<Company>();
		company.add(new Admin1("keshav", "koli", 22, new AddressInfo("khadki", "pune", "maharashtra"), "username",
				"password"));
		company.add(new Manager1("kartik", "kumar", 19, new AddressInfo("khadki", "pune", "maharashtra"), "HR"));
		writeInheritance(company);
	}

	private static void writeInheritance(List<Company> company) {
		ObjectMapper mapper = new ObjectMapper();
		String json;

		try {
			json = mapper.writeValueAsString(company);
			System.out.println("Converted to Json String : " + json);
			readInheritance(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static void readInheritance(String json) {
		ObjectMapper mapper = new ObjectMapper();
		Company[] company;
		try {
			company = mapper.readValue(json, Company[].class);
			System.out.println("Converted to Object :" + new Gson().toJson(company));
			// it neglects the null field 
			//the upper sysout will take out the null values which are present 
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
