/**
 * 
 */
package com.tampro.unit3;

/**
 * @author TamNguyen
 *
 */
public class MethodReference {
	public static void main(String[] args) {
		Thread thread = new Thread(MethodReference::printMessage);
		//MethodReference::printMessage == ()->printMessage();
		thread.run();
	}
	public static void printMessage() {
		System.out.println("hello");
	}
}
