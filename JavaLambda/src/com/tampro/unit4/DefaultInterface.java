package com.tampro.unit4;

@FunctionalInterface
public interface DefaultInterface {
	default void show() {
		System.out.println("default interface");
	}
	
	int sum(int a, int b);
}
