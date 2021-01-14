package com.tampro;

@FunctionalInterface // đánh dấu đây la 1 functionInteface 
// khi đó nếu chúng ta thêm 1 hàm cùng parameter thì sẽ báo lỗi ở compile
public interface Greeting {
	
	public void perform();
 
}
