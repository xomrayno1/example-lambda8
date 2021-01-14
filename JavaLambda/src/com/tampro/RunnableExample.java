package com.tampro;

public class RunnableExample {
	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Printed inside runnable 1");
			}
		});
		myThread.run();
		
		Thread myLambdaThread = new Thread(()-> System.out.println("Printed inside runnable 2 "));
		myLambdaThread.run();
		
		Runnable runnable = ()->{
			System.out.println("Printed inside runnable 3");
		};
		runnable.run();
		
		 

	}

}
