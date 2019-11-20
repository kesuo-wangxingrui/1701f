package com.single;

public class Singleton {
    private static Singleton instance;
      
    private Singleton(){
    	System.out.println("这是实例化一个单例模式");
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
