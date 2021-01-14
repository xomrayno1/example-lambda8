/**
 * 
 */
package com.tampro.unit2;

import java.util.function.BiConsumer;

/**
 * @author TamNguyen
 *
 */
public class ExceptionHandlingExample {
	public static void main(String[] args) {
		int[] someNumbers = { 1, 2, 3, 4};
		int key = 2;
		process(someNumbers, key , wrapperLambda((v, k) -> System.out.println(v / k)));
		// (v, k) -> System.out.println(v + k))  type  BiConsumer<Integer, Integer>
	}
															// action
	private static void process(int[] someNumbers, int key,BiConsumer<Integer, Integer> biConsumer ) {
		// TODO Auto-generated method stub
		for(int i  : someNumbers) {
			biConsumer.accept(i, key);
		}
	}
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer) {
		return (v,k) -> {
			try {
				consumer.accept(v, k);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Exception caught in wrapper lambda");
			}
		};
	}
}
