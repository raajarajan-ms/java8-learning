package com.interviewprep.lambdas;

public class AtmConsoleMain {
	
	public String prefix = "I am instance";
	static String suffix = "I am static";

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// this is called concrete implementation
		AtmConsole console = new AtmConsoleImpl();
		checkBalance(console);
		
		//calling again
		System.out.println("Second time");
		checkBalance(new AtmConsoleImpl());
		
		//using Anonymous Innerclass		
		checkBalance(new AtmConsole() {
			private String anon = "Anonymous class local var";
			String local = "iam static";
			
			@Override
			public void accountBalance(double balance) {
				// can access local and instance varibles using this
				System.out.println("Printing Using Anonymous Inner class - "
				+local+this.anon +balance);
			}
		});
		
		String localVar = "access me";
		
		//using Lambda Expressions
		AtmConsole cons = balance -> System.out.println(suffix+balance);
		
		/* we can access instance variables, only if we are inside inside method,
		 but we cannot access instance variables in static scope.
		*/ 
//		AtmConsole cons = balance -> System.out.println(this.prefix+balance);
		
		checkBalance(cons);
		
		// we can also pass directly
		checkBalance( balance -> System.out.println(localVar+balance));
		
		
	}
	
	static void checkBalance(AtmConsole atmConsole) {
		atmConsole.accountBalance(20.0);
	}

}
