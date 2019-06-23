package com.codingdojo.zookeeper;

public class Gorilla extends Mammal {

	protected int currentEnergy = energyLevel;
	private int throwing = 5;
	private int banana = 10;
	private int climbing = 10;
	
	
	public void throwSomething(){
        System.out.println("Me, Kong! I THROW ROCKS AT YOU!");
        currentEnergy = currentEnergy - throwing;
        //System.out.println(currentEnergy);
        // -5
    }
	
	public void eatBananas(){
        System.out.println("Me, Kong! Me LIKE BANANAS!");
        currentEnergy = currentEnergy + banana;
        //System.out.println(currentEnergy);
        // +10
    }
	
	public void climb(){
        System.out.println("Me, Kong! I Climb Tree Now!");
        currentEnergy = currentEnergy - climbing;
        //System.out.println(currentEnergy);
        // -10
    }
	
	
}
