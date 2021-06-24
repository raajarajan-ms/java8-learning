package com.interviewprep.streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> list = List.of(
				new Movie("aambala",25,Genre.THRILLER),
				new Movie("pombala",25,Genre.DRAMA),
				new Movie("Karnan",100,Genre.DRAMA),
				new Movie("Asura",50,Genre.DRAMA),
				new Movie("Master",10,Genre.ACTION),
				new Movie("Pursuit Of happiness",200,Genre.ACTION));
		
		//Collecting list to Map
		
		Map<String, Integer> map = list.stream().collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
		Map<String, Integer> map1 = list.stream().collect(Collectors.toMap(m -> m.getTitle(), m->m.getLikes()));
		
		System.out.println(map);
		System.out.println(map1);
		
		Map<String, Movie> map3 = list.stream().collect(Collectors.toMap(m -> m.getTitle(), Function.identity()));	
		System.out.println(map3);
		Movie name = map3.get("aambala");
		System.out.println(name.getTitle());
		
		//joining
		String concatenated = 
				list.stream().map(movie -> movie.getTitle()).collect(Collectors.joining(","));
	   
		System.out.println(concatenated);
		
		//summing - summingLong,summingDouble
		int summedValue = list.stream().collect(Collectors.summingInt(Movie::getLikes));
		System.out.println(summedValue);
		
		//summarizingInt,summarizingLong,summarizingDouble
		IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(Movie::getLikes));
		System.out.println(stats);
		
		
		
	}

}
