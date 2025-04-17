package com.tnsif.threads;

public class RunnableDemo  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingRunnable obj=new UsingRunnable(10,20,"Hello");
		
		Runnable runnable=new Runnable() {

			@Override
			public void run() {
				//anonymous class
				// TODO Auto-generated method stub
				System.out.println("Runnable with anonymous class");
			}
			
		};
		Thread thread =new Thread (runnable);
		thread.start();
		
		

}
}
