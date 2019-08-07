package com.wangxile.offer;

import java.lang.reflect.Field;

public class SwapDemo {
	public static void main(String[] args) throws Exception {
		Integer a = new Integer(128);
		Integer b = new Integer(129);
		//Integer a = 128;
		//Integer b = 129;
		System.out.println("before:a=" + a + ",b=" + b);
		//swap4(a, b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("after:a=" + a + ",b=" + b);
	}
	
	public static void swap(Integer i1, Integer i2){
		Integer tmp = i1;
		i1 = i2;
		i2 = tmp;
	}
	
	public static void swap2(Integer i1, Integer i2) throws Exception, Exception{
		Field field = Integer.class.getDeclaredField("value");
		field.setAccessible(true);
		Integer tmp = i1;
		field.set(i1, i2.intValue());
		field.set(i2, tmp);
	}
	
	public static void swap3(Integer i1, Integer i2) throws Exception, Exception{
		Field field = Integer.class.getDeclaredField("value");
		field.setAccessible(true);
		Integer tmp = new Integer(i1);
		field.set(i1, i2.intValue());
		field.set(i2, tmp);
	}
	
	public static void swap4(Integer i1, Integer i2){
		i1 = i1 ^ i2;
		i2 = i1 ^ i2;
		i1 = i1 ^ i2;
	}

}
