package com.codingdojo.zookeeper;

public class GorillaTest {
	public static void main(String[] args) {
		Gorilla g = new Gorilla();

		
		System.out.println("My starting energy level is: " + g.displayEnergy(g.currentEnergy));
		
		g.throwSomething();
		g.throwSomething();
		g.throwSomething();
		//System.out.println("My current energy level is: " + g.displayEnergy(g.currentEnergy));
		
		g.eatBananas();
		g.eatBananas();
		//System.out.println("My current energy level is: " + g.displayEnergy(g.currentEnergy));
		
		g.climb();
		//System.out.println("My current energy level is: " + g.displayEnergy(g.currentEnergy));
		
		System.out.println("My current energy level is: " + g.displayEnergy(g.currentEnergy));
		
	}
}
