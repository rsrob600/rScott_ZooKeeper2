package com.codingdojo.zookeeper;

class HumanTest {
    public static void main(String[] args) {
        Human h = new Human();
        
        
        h.regulateTemperature();
        h.startSleeping();
        h.goToWork();
        boolean sleeping = h.isSleeping();
        
        if (sleeping){
            System.out.println("The human is sleeping!");
        }
        
		System.out.println("My starting energy level is: " + h.displayEnergy(h.currentEnergy));
		
		h.throwSomething();
		//System.out.println("My current energy level is: " + h.displayEnergy(h.currentEnergy));
		
		h.eatBananas();
		h.eatBananas();
		//System.out.println("My current energy level is: " + h.displayEnergy(h.currentEnergy));
		
		h.climb();
		h.climb();
		h.climb();
		//System.out.println("My current energy level is: " + h.displayEnergy(h.currentEnergy));
		
		h.eatSteak();
		h.eatSteak();
		h.eatSteak();
		h.eatSteak();
		//System.out.println("My current energy level is: " + h.displayEnergy(h.currentEnergy));
		
		System.out.println("My current energy level is: " + h.displayEnergy(h.currentEnergy));
        
    }
}

