package com.aastha.fact.model;


import java.util.*;

public class CatFact{ 
	List<String> list = Arrays.asList("Cats can jump up to 6 times their height.", "They have a total of 18 toes", "There are over 500 million pet cats!",
			"Cats sleep for around 13 to 16 hours a day (70% of their life).","1 year of a cats life equals to 15 years of a humans live.");
	
	public String getFactByNumber(int number) {
		return list.get(number);
	}

}