package com.interviewprep.lambdas;

public class AtmConsoleMain {

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
			
			@Override
			public void accountBalance(double balance) {
				// TODO Auto-generated method stub
				System.out.println("Printing Using Anonymous Inner class - "+balance);
			}
		});
		
		//using Lambda Expressions
		AtmConsole cons = balance -> System.out.println(balance);
		
		checkBalance(cons);
		
		// we can also pass directly
		checkBalance( balance -> System.out.println(balance));
		
		
	}
	
	static void checkBalance(AtmConsole atmConsole) {
		atmConsole.accountBalance(20.0);
	}

}
