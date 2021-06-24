package com.interviewprep.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class WaysOfCreatingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Every Collection Interface has Stream method in it
		 * But Map is not inherited from Collection Interface.
		 */
		HashMap<String,String> map = new HashMap<>();
		map.put("Rajarajan", "Sivaraj");
		map.put("Suneka", "Kuppan");
		
		
		List<String> list = new LinkedList<>();
		list.add(0, "Raj");
		list.add(1, "Baby");
		
		list.stream().forEach(System.out::println);
		
		// creating stream using array
		int[] arr = {1,2,3,4,5,6,7};
		int val = Arrays.stream(arr).filter(item -> item>5).sum();
		System.out.println(val);
		
		String name ="Rajarajan";
		name.chars();// gives IntStream
		
		//Creating Stream from arbitrary numbers
		Stream.of("Raj","Babe").filter(item -> item.contains("b"))
		                                         .forEach(System.out::println);
		
		//creating Stream using genrate
		Stream.generate(() -> Math.random()).limit(2).forEach(System.out::println);
		
		//Stream.generate(() -> Math.random()).forEach(System.out::println);
		
		//creating infinite Stream
		Stream.iterate(100, n -> n+1).limit(10).forEach(System.out::println);
		

	}

}
