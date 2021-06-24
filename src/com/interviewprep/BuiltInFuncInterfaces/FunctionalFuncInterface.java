package com.interviewprep.BuiltInFuncInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;

public class FunctionalFuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Integer,Integer> func = num -> num*num;
		System.out.println(func.apply(10));
		
		// this will give a round of result by eliminating digits after decimal point
		Function<Double,Integer> func1 = num -> (int)(num + 1);
		System.out.println(func1.apply(1.1));
		
		System.out.println(func1.andThen(func).apply(5.0));
		
		System.out.println(func.compose(func1).apply(5.0));
		
		BiFunction<Integer,Integer,String> biFunc = (num1,num2) -> String.valueOf(num1*num2);
		
		System.out.println(biFunc.apply(8, 7));
		
		IntFunction intFunc = num -> num*num;
		intFunc.apply(4);
		
		
		

	}

}
