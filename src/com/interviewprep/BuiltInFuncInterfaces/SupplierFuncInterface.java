package com.interviewprep.BuiltInFuncInterfaces;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierFuncInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Supplier<Double> supplier =  () -> Math.random();
		
		supplier.get();
		
		Supplier<Integer> supplier1 = () -> 10;
		
		System.out.println(supplier1.get());
		
		IntSupplier intSupp = () -> 20-13;
		
		System.out.println(intSupp.getAsInt());
		
		BooleanSupplier boo = () -> 50>20 ;
		
		System.out.println(boo.getAsBoolean());
	}

}
