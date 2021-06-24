package com.interviewprep.lambdas;

/*
 * To Illustrate method references 
 *  by calling instance methods
 *  static methods
 *  calling constructors
 */
public class MethodRefDemo {
	
	MethodRefDemo(double balance){
		
	}

	public void callInstance(double balance) {
		
	}
	
	
   static void callStatic (double balance) {
	   
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling instance method
		MethodRefDemo object = new MethodRefDemo(0.0);
		object.checkBal(object::callInstance);
		
		//calling static method
		object.checkBal(MethodRefDemo::callStatic);
		
		//calling Constructor
		object.checkBal(MethodRefDemo::new);
		

	}

	
    public void checkBal(AtmConsole atmConsole) {
    	atmConsole.accountBalance(20.0);
    	callStatic(0.0);
    	MethodRefDemo.callStatic(0.0);
    }
}
