package com.single;

public class Singleton {
    private static Singleton instance;
      
    private Singleton(){
    	System.out.println("����ʵ����һ������ģʽ");
    }
    public static Singleton getInstance(){
    	if(instance == null){
    		instance  = new Singleton();
    	}
    	return  instance;
    }
}
//public class SingletonHungry(){
//	   while(true){
//		   new Thread ()
//	   }
//}
