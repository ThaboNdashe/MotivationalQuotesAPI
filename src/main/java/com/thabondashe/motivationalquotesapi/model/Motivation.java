package com.thabondashe.motivationalquotesapi.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Motivation{
	private String key1;
	private String key2;


	public Motivation(String key1, String key2) {
		this.key1 = key1;
		this.key2 = key2;
	}

	public void setKey1(String key1){
		this.key1 = key1;
	}

	public String getKey1(){
		return key1;
	}

	public void setKey2(String key2){
		this.key2 = key2;
	}

	public String getKey2(){
		return key2;
	}

	@Override
 	public String toString(){
		return 
			"Motivation{" + 
			"key1 = '" + key1 + '\'' + 
			",key2 = '" + key2 + '\'' + 
			"}";
		}
}
