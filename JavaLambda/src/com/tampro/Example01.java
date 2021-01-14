
package com.tampro;

/**
 * @author TamNguyen
 *
 */
public class Example01 {
	public static void main(String[] args) {
		 MyLamba greetingFunction = () -> System.out.print("hello world");
		 MyAdd addFunction = (int a , int b) -> a + b;
		 // có thể hiểu dùng lambda để viết  phần thân cho method interface ~~ =
		 greetingFunction.foo();
		 System.out.println(addFunction.add(3, 5));
		 
		 printLambda(s -> s.length()); // truyền viết lại
		 
		 Greeting greeting = ()->System.out.println("Viết perform");
		 greeting.perform();
		 
		 
	}
	 
	public static void printLambda(StringlengthLambda lambda) {
		System.out.println(lambda.getLength("hello world"));
	}
	interface StringlengthLambda{
		int getLength(String s);
	}
	
	
	
}

interface MyLamba{ // 1 interface chỉ 1 method , nếu add thêm sẽ bị lỗi
	void foo();
	 
}
interface MyAdd{
	int add(int a , int b);
}


