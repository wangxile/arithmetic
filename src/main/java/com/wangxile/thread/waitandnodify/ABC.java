package com.wangxile.thread.waitandnodify;


public class ABC {
   public static boolean isTheadA = true;
   public static boolean isTheadB = false;
   public static boolean isTheadC = false;
   
   public static void main(String[] args) {
	new Thread(new Runnable(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i < 10; i++){
				synchronized (ABC.class) {
					while(!isTheadA){
						try {
							ABC.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					 System.out.print("A");    
					 isTheadB = true;    
					 isTheadA = false;
					 ABC.class.notifyAll(); 
				    }
			  }
			}
	}).start();
	
	new Thread(new Runnable(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i < 10; i++){
				synchronized (ABC.class) {
					while(!isTheadB){
						try {
							ABC.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					 System.out.print("B");    
					 isTheadC = true; 
					 isTheadB = false;    
					 ABC.class.notifyAll(); 
				}
			}
		}
	}).start();
	
	new Thread(new Runnable(){
		@Override
		public void run() {
			// TODO Auto-generated method stub
			for(int i = 0; i < 10; i++){
				synchronized (ABC.class) {
					while(!isTheadC){
						try {
							ABC.class.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					 System.out.print("C");    
					 isTheadA = true; 
					 isTheadC = false;    
					 ABC.class.notifyAll(); 
				}
			}
		}
		
	}).start();
   }
}
