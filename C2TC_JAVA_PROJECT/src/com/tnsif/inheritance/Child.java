package com.tnsif.inheritance;

public class Child extends Father{

	public static void main(String args[]) {
		
		Child ch = new Child(); // normally we were creating obj for father where properties and behaviours were there
		//but in inheritance concept we should create obj of inherited class
		ch.coffee();
		ch.tea();
		ch.greentea();
		System.out.println(ch.colour);
		System.out.println(ch.money);
		
	}
}
