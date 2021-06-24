package com.interviewprep.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> list = List.of(
				new Movie("aambala",25,Genre.THRILLER),
				new Movie("pombala",25,Genre.DRAMA),
				new Movie("Karnan",100,Genre.DRAMA),
				new Movie("Asura",50,Genre.DRAMA),
				new Movie("Master",10,Genre.ACTION),
				new Movie("Pursuit Of happiness",200,Genre.ACTION));
		
		int count = 0;
		for(Movie movie : list) {
			
			if(movie.getLikes()>50) {
				count++;
			}
		}
		
       long likesCount = list.parallelStream().filter(movie -> movie.getLikes()>50).count();
       
       System.out.print(likesCount);
       
       
       
       // Mapping Functions using Stream
       
       list.stream().map(movie -> movie.getTitle()).forEach(System.out::println);
       
       // using flatmap
       
       Stream<List<String>> data = Stream.of(List.of("a","b","c"),List.of("d","e"));//Stream<List<String>>
       
       data.flatMap(listItem -> listItem.stream()).filter(item -> item.equals("b"))
       .forEach(System.out::println);
       
       
//       list.stream().limit(1).map(movie -> movie.getTitle()).flatMap(title -> title.)
       
       
       //slicing or pagination using skip method
       list.stream().skip(3).limit(1).forEach(movie -> System.out.println(movie.getTitle()));
       
       //sorting Stream produces same results
       list.stream().sorted().map(Movie::getLikes).forEach(System.out::println);
       
       System.out.println("Sorting Streams");
       list.stream().sorted((a,b) -> a.getTitle().compareTo(b.getTitle())).
                                       forEach(movie -> System.out.println(movie.getTitle()));
       
       /*
        * cannot invoke compareTo(int) for priitive type int,
        * because primitives are not objects so don't have equal methods in it
        * use ==
        */
//       list.stream().sorted((a,b) -> a.getLikes().compareTo(b.getLikes())).
//       forEach(movie -> movie.getTitle());
       
       System.out.println("Sorting Streams using comparing");
       list.stream().sorted(Comparator.comparing(Movie::getTitle))
       .forEach(movie -> System.out.println(movie.getTitle()));
       
       System.out.println("reversing the order");
       list.stream().sorted(Comparator.comparing(Movie::getTitle).reversed())
       .forEach(movie -> System.out.println(movie.getTitle()));
       
       //Distinct element
       list.stream().map(movie -> movie.getLikes()).distinct()
       .forEach(System.out::println);
       
       /*
        * peek method is used to output each operation for trouble shooting issues
        */
       list.stream().filter(movie -> movie.getLikes() > 100)
       .peek(movie -> System.out.println("filtered - "+movie.getTitle())).
       forEach(movie -> System.out.println(movie.getTitle()));
       

	}

}
