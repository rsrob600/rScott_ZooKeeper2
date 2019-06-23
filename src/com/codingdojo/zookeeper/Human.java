package com.codingdojo.zookeeper;

class Human extends Mammal {
	
	protected int currentEnergy = energyLevel;
	private int throwing = 25;
	private int banana = 50;
	private int steak = 500;
	private int climbing = 100;
	
    
    public void goToWork(){
        System.out.println("I'm going to work, something only humans can do.");
    }
    public void startSleeping() {
        System.out.println("Toss and turn");
        super.startSleeping();
    }
    
	public void throwSomething(){
        System.out.println("Humans are not as strong as Gorillas so it takes more energy to throw things");
        currentEnergy = currentEnergy - throwing;
        //System.out.println(currentEnergy);
        // -25
    }
	
	public void eatBananas(){
        System.out.println("Humans don't need to eat that many bananas because we eat other high nutrient foods");
        currentEnergy = currentEnergy + banana;
        //System.out.println(currentEnergy);
        // +50
    }
	
	public void eatSteak(){
        System.out.println("Humans eat steak for its high protein value, mmmmm good!");
        currentEnergy = currentEnergy + steak;
        //System.out.println(currentEnergy);
        // +500
    }
	
	public void climb(){
        System.out.println("Humans are not as strong as Gorillas so it takes more energy to climb things");
        currentEnergy = currentEnergy - climbing;
        //System.out.println(currentEnergy);
        // -100
    }
}
