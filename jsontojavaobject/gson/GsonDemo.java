package com.jsontojavaobject.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

//Gson 
public class GsonDemo {

	public static void main(String[] args) {

		// first we will serialize means pojo to json
		getJson(new User("keshav", "koli", 22, new Address("pune", "pune-mumbai-road", 411003, "Maharashtra")));
	}

	private static void getJson(User user) {
		// Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();// it will print the json pretty
		String json = gson.toJson(user);
		System.out.println(json);
		getObj(json);
	}

// in this method we have deserialized  from Json to java object
	private static void getObj(String json) {
		Gson gson = new Gson();
		User user = gson.fromJson(json, User.class);
		System.out.println(user.getFirstName());
		System.out.println(user.getLastName());
		System.out.println(user.getAge());
		System.out.println(user.getAddress().getCity());
		System.out.println(user.getAddress().getStreet());
		System.out.println(user.getAddress().getPincode());
		System.out.println(user.getAddress().getState());
	}

}
