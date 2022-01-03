package com.inheritenceinjavabyjsonbygson;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class GsonDemo {
	public static void main(String[] args) {

		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Admin("keshav", "koli", 22, new AddressInfo("khadki", "pune", "maharashtra"), "username",
				"password"));
		employee.add(new Manager("kartik", "kumar", 19, new AddressInfo("khadki", "pune", "maharashtra"), "HR"));
		writeInheritance(employee);
	}

	private static void writeInheritance(List<Employee> employee) {
		Gson gson = new Gson();
		String json = gson.toJson(employee);
		System.out.println("Converted to Json String : " + json);
		readInheritance(json);
	}

	private static void readInheritance(String json) {
		Type listofemployee = new TypeToken<ArrayList<Employee>>() {}.getType();// the Type is imported from Type java.lang.reflect
		RuntimeTypeAdapterFactory <Employee> typeAdapterFactory = RuntimeTypeAdapterFactory.of(Employee.class, "employeeType")
				.registerSubtype(Admin.class, EmployeeType.ADMIN.name())
				.registerSubtype(Manager.class, "MANAGER");
		System.out.println("List of Employee : " + listofemployee);
		//Gson gson = new GsonBuilder().setPrettyPrinting().create();// WE can have both Gson 
		Gson gson = new GsonBuilder().registerTypeAdapterFactory(typeAdapterFactory).setPrettyPrinting().create();
		System.out.println(": gson:  " + gson);
		//to use the Employee List type we use Array we use below method
		//Employee[] employee = gson.fromJson(json, Employee[].class);
		List<List> employee = gson.fromJson(json, listofemployee);
		
		//if we want to read from files we can write and we have to handle try/Catch
		//	List<List> employee = gson.fromJson(new FileReder("filePath"), listofemployee);
		System.out.println("Converted to Object : " + gson.toJson(employee));
		// its basic serialization and Deserialization
	}
}
