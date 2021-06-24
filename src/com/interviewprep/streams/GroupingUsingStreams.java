/**
 * 
 */
package com.interviewprep.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Rajarajan Sivaraj
 *
 */
public class GroupingUsingStreams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//groupingby
		List<Movie> list = List.of(
				new Movie("aambala",25,Genre.THRILLER),
				new Movie("pombala",25,Genre.DRAMA),
				new Movie("Karnan",100,Genre.DRAMA),
				new Movie("Asura",50,Genre.DRAMA),
				new Movie("Master",10,Genre.ACTION),
				new Movie("Pursuit Of happiness",200,Genre.ACTION));
		
		Map<Genre, List<Movie>> grouping = list.stream().collect(Collectors.groupingBy(Movie::getGenre));
		
		System.out.println(grouping);
		
		Map<Genre, Long> grouping1 = list.stream().collect(Collectors.groupingBy(Movie::getGenre,
				                                              Collectors.counting()));
		
		System.out.println(grouping1);
		
		Map<Genre, String> grouping2 = list.stream().collect(Collectors.groupingBy(Movie::getGenre,
                Collectors.mapping(Movie::getTitle, Collectors.joining(","))));

        System.out.println(grouping2);
		
		
	}

}
