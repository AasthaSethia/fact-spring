package com.aastha.fact.model;


import java.util.*;

public class DogFact{ 
	List<String> list = Arrays.asList("Dog's sense of smell is at least 40x better than ours", "Dogs don’t sweat like we do", "Dog could be left or right-pawed",
			"Dog's hearing is super sensitive"," Dogs have 18 muscles controlling their ears");
	
	public String getFactByNumber(int number) {
		return list.get(number);
	}

}