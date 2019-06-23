package com.codingdojo.zookeeper;

public class Bat extends Mammal {
	
	protected int currentEnergy = 300;
	private int flying = 50;
	private int human = 25;
	private int attacking = 100;
	
	
	public void fly(){
        System.out.println("Flap, Flap, Flap, as I fly away!");
        currentEnergy = currentEnergy - flying;
        //System.out.println(currentEnergy);
        // -50
    }
	
	public void eatHumans(){
        System.out.println("Noooooooooo, don't eat me! I still have 15 weeks left of CodingDojo lessons!");
        currentEnergy = currentEnergy + human;
        //System.out.println(currentEnergy);
        // +25
    }
	
	public void attackTown(){
        System.out.println("Snap, crackle, pop, As your town burns down!");
        currentEnergy = currentEnergy - attacking;
        //System.out.println(currentEnergy);
        // -100
    }
	
	
	
	
	
	

}
