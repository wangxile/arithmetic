package com.wangxile.proxy.jdk;


public class FlyNoWay implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("i cant fly");

	}
	public void fly2(){
		System.out.println("fly2");
	}

}
