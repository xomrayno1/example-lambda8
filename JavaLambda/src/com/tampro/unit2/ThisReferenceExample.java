/**
 * 
 */
package com.tampro.unit2;

/**
 * @author Admin
 *
 */
public class ThisReferenceExample {
	public void doProcess(int i , Process process) {
		process.process(i);
	}
	public void execute() {
		doProcess(10, i ->{
			System.out.println("Value of i is : "+i);
			System.out.println(this);
		});
	}
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
//		thisReferenceExample.doProcess(10 , new Process() {
//			
//			@Override
//			public void process(int i) {
//				// TODO Auto-generated method stub
//				System.out.println("Value of i is "+ i);
//				System.out.println(this);
//			}
//		});
		thisReferenceExample.execute();
		
	}
	
	@Override
	public String toString() {
		return "this is the main thisReferenceExample class instance";
	}
}
