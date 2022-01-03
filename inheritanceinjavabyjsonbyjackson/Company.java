package com.inheritanceinjavabyjsonbyjackson;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonSubTypes.Type;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.inheritenceinjavabyjsonbygson.AddressInfo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "companyType", include = JsonTypeInfo.As.EXISTING_PROPERTY, visible = true)
@JsonSubTypes({ @Type(value = Admin1.class, name = "ADMIN1"), @Type(value = Manager1.class, name = "MANAGER1") })

public class Company {
	private CompanyType companyType;
	private String firstNAME;
	private String lastNAME;
	private Integer age;
	private AddressInfo addressinfo;
}
