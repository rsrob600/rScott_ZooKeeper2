package com.codingdojo.zookeeper;

public class BatTest {
	public static void main(String[] args) {
		Bat b = new Bat();
		
		
		System.out.println("My starting energy level is: " + b.displayEnergy(b.currentEnergy));
		
		b.attackTown();
		b.attackTown();
		b.attackTown();
		//System.out.println("My current energy level is: " + b.displayEnergy(b.currentEnergy));
		
		b.eatHumans();
		b.eatHumans();
		//System.out.println("My current energy level is: " + b.displayEnergy(b.currentEnergy));
		
		b.fly();
		b.fly();
		//System.out.println("My current energy level is: " + b.displayEnergy(b.currentEnergy));
		
		System.out.println("My current energy level is: " + b.displayEnergy(b.currentEnergy));
		
	}

}
