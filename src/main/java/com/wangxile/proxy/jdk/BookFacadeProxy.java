package com.wangxile.proxy.jdk;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class BookFacadeProxy implements InvocationHandler{
	//也就是说动态代理实际是通过接口生成增强过后的子类（CGLIB直接对代理对象继承）来实现的，
	//因此代理是基于继承机制的，这也是Spring AOP框架无法对static与final进行切面的原因，由于不支持重写。
	private Object target;
	
	public Object bind(Object target){
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this); 
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("1");
		Object o = method.invoke(target, args);
		System.out.println("2");
		return o;
	}
	public static void main(String[] args) {
		FlyNoWay c = new FlyNoWay();
		BookFacadeProxy proxy = new BookFacadeProxy();
		FlyBehavior c2 = (FlyBehavior) proxy.bind(c);
		c2.fly();
	}
	
}
