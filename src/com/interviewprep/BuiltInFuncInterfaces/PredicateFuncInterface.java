package com.interviewprep.BuiltInFuncInterfaces;

import java.util.List;
import java.util.function.Predicate;

public class PredicateFuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Predicate<String> pred = name -> name.equalsIgnoreCase(name);
		
		Predicate<String> pred1= name -> name.contains(name);		
		
		System.out.println(pred1.and(pred).test("Raja"));
		
		System.out.println(pred1.or(pred).test("Raja"));
		
		System.out.println(pred1.negate().test("Raja"));
		
		List<String> list = List.of("Raja","Baby");
		
		

	}

}
