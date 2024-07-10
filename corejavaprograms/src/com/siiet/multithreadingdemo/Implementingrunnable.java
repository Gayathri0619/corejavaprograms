package com.siiet.multithreadingdemo;

public class Implementingrunnable {

	public static void main(String[] args) {
		Implementingrunnable r=new Implementingrunnable();
		
		Thread t1=new Thread();
		t1.start();

	}
	
	public void run() {
		System.out.println("implementing runnable interface");
	}

}
