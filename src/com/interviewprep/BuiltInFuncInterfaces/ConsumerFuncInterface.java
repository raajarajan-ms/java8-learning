package com.interviewprep.BuiltInFuncInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerFuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list = List.of(10,20,30,40,50);
		
		Consumer<Integer> consumer = item -> System.out.println(item);
		
//		list.forEach(consumer);
		
		Consumer<Integer> consumer1 = item -> System.out.println(item+1);
		
		//chaining consumer
		list.forEach(consumer.andThen(consumer1));
		
		//Bi-Consumer
		BiConsumer<String, Integer> biConsumer = (name,no) -> System.out.println(name+"-"+no);
		biConsumer.accept("Raja", 2701);
		
        Consumer<String> dmName = name -> System.out.print(name);
        dmName.accept("Domain Name - ");
        
        
        Consumer<String> dmName1 = name -> System.out.print(name);
        dmName.accept("rajasiva");
        
        dmName.andThen(dmName1);
        System.out.println();
		
        
        
        //PrimitiveSpecilization
        IntConsumer intConsumer = num -> System.out.println(num);
        intConsumer.accept(1414);
        
        LongConsumer longConsumer = num -> System.out.println(num+1);
        longConsumer.accept(1);
        
        DoubleConsumer doubleConsumer = dec -> System.out.println(dec-1);
        doubleConsumer.accept(2.0);
        

	}

}
