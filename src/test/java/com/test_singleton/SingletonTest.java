package com.test_singleton;

import org.junit.Test;

import com.single.Singleton;

public abstract class SingletonTest {
         
	@Test
	public void testSinglon1(){
		  Singleton instance = Singleton.getInstance();
		  Singleton instance1 = Singleton.getInstance();
        
	}
	public static void main(String[] args) {
		
			while(true){
				 new Thread(new Runnable() {
					public void run() {
						 try {
				           Thread.sleep(1000);			
						} catch (Exception e) {
						  e.printStackTrace();
						}
						Singleton singlon = Singleton.getInstance();
					}
				}).start();
			}
		
	}
	@Test
	public void  testSingletonHunger(){
		while(true){
			new Thread(new Runnable() {
				public void run() {
                  try {
				   Thread.sleep(100);	
				} catch (Exception e) {
                     e.printStackTrace();
				}
                 //Singleton single
				}
			});
		}
	}
	
	
	
	
}
