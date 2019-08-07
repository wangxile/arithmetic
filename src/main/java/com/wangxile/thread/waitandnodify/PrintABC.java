package com.wangxile.thread.waitandnodify;

public class PrintABC {    
    
    public static Boolean isThreadA = true;    
    public static Boolean isThreadB = false;    
    public static Boolean isThreadC = false; 
    public static Boolean isThreadD = false;
    public static Boolean isThreadE = false;
    public static Boolean isThreadF = false;
    public static Boolean isThreadG = false;
    public static Boolean isThreadH = false;
    public static Boolean isThreadI = false;
    
    public static void main(String[] args) {    
        final PrintABC abc = new PrintABC();    
        new Thread(new Runnable() {    
            public void run() {    
                    synchronized (abc) {    
                        while(!isThreadA) {    
                            try {    
                                abc.wait();    
                            } catch (InterruptedException e) {    
                                // TODO Auto-generated catch block    
                                e.printStackTrace();    
                            }    
                        }    
                            System.out.print("A");    
                            isThreadB = true;    
                            abc.notifyAll(); 
                    }    
            }    
        }).start();    
    
        new Thread(new Runnable() {    
            public void run() {    
                    synchronized (abc) {    
                        while(!isThreadB) {    
                            try {    
                                abc.wait();    
                            } catch (InterruptedException e) {    
                                // TODO Auto-generated catch block    
                                e.printStackTrace();    
                            }    
                        }    
                            System.out.print("B");    
                            isThreadC = true;    
                            abc.notifyAll();  
                    }    
            }    
        }).start();    
            
        new Thread(new Runnable() {    
            public void run() {    
                    synchronized (abc) {    
                        while(!isThreadC) {    
                            try {    
                                abc.wait();    
                            } catch (InterruptedException e) {    
                                // TODO Auto-generated catch block    
                                e.printStackTrace();    
                            }    
                        }    
                            System.out.print("C"); 
                            isThreadD = true; 
                            abc.notifyAll();    
                    }    
            }    
        }).start();   
        
        new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized(abc){
					while(!isThreadD){
						try {
							abc.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					System.out.println("D");
					abc.notifyAll();
				}
			}
        	
        }).start();
    }    
}