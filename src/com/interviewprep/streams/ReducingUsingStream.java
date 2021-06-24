package com.interviewprep.streams;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ReducingUsingStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Movie> list = List.of(
				new Movie("aambala",25,Genre.THRILLER),
				new Movie("pombala",25,Genre.DRAMA),
				new Movie("Karnan",100,Genre.DRAMA),
				new Movie("Asura",50,Genre.DRAMA),
				new Movie("Master",10,Genre.ACTION),
				new Movie("Pursuit Of happiness",200,Genre.ACTION));
		
		//Reducers
		
		//count
		
		//anyMatch uses predicate to test conditions
		boolean title = list.stream().anyMatch(movie -> movie.getLikes() == 200);
		System.out.println(title);
		
		
		//allMatch uses predicate to test conditions
		boolean cond = list.stream().allMatch(movie -> movie.getLikes() == 200);
         System.out.println(cond);
         
         //noneMatch uses predicate to test conditions
         boolean cond1 = list.stream().noneMatch(movie -> movie.getLikes() == 2000);
         System.out.println(cond1);
         
         
         //findFirst returns optional
         Optional<Movie> name = list.stream().findFirst();
         System.out.println(name.get().getTitle());
         
         //findAny returns optional
         Optional<Movie> any = list.stream().findAny();
         System.out.println(any.get().getTitle());
         
         //min amd max uses comparator
         
         Optional<Movie> min = list.stream().min(Comparator.comparing(Movie::getLikes));
          System.out.println(min.get().getTitle());
          
          
          Optional<Movie> max = list.stream().max(Comparator.comparing(Movie::getLikes));
          System.out.println(max.get().getTitle());
          
          
          // using reducer
          /*
           * Reducer is overloaded iwth 
           *   Identity, BinaryOp  - no optional retirun 
           *   Binary Op witout Identity  - returns optional
           */
    Optional<Integer> val = list.stream().map(movie -> movie.getLikes()).reduce((m,n) -> m+n);
   System.out.println(val.get());
   
   System.out.println("using seed, seed value will be added to it");
   Integer val1 = list.stream().map(movie -> movie.getLikes()).reduce(5,(m,n) -> m+n);
   System.out.println(val1);
   
    
    
    
	}
	

}
