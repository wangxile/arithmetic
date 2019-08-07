package com.wangxile.offer;

public class TenToTwo {
	//十进制转换为二进制
	public static String parse(int ten){
		String two = "";
		do{
		 int t = ten % 2;
		if(t == 1){
		  two =  "1" + two;
		}else{
		  two = "0" + two;
		}
		ten /= 2;
		}while(ten != 0);
		return two;
	}
	public static void main(String[] args) {
		System.out.println(parse(10));
	}

}
