package com.tampro.stream;

import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample03 {
	public static void main(String[] args) {
		Stream<String> stream = Stream.of("java","php","c#");
		stream.map(item -> { //print được
			return item.toUpperCase(); 
		}).collect(Collectors.toList()).forEach(System.out::println);
		
//		stream.map(item -> {  
//			return item.toUpperCase();
//		}).collect(Collectors.toList()).forEach(System.out::println);
		//ko in được bị lỗi do Reuse với stream: stream không thể reuse lại:
		
		//chú ý
		//cách xử lý :
			//tạo mới :   stream = Stream.of("java","php","c#");
		 	//dùng suppliers
		
		 Supplier<Stream<String>> steamSupplier  =  () -> Stream.of("java","php","c#");
		 steamSupplier.get().forEach(System.out::println);
		 steamSupplier.get().forEach(System.out::println);
	}

}
