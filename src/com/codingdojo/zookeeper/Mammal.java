package com.codingdojo.zookeeper;

class Mammal{
    private boolean sleeping = false;
    protected int energyLevel = 100;
    
    public void regulateTemperature() {
        System.out.println("My temperature is just right now.");
    }
    public void startSleeping() {
        sleeping = true;
        System.out.println("ZzZz");
    }
    public boolean isSleeping(){
        return sleeping;
    }
    
    public int energyLevel() {
    	return energyLevel;
    }
    
    public int displayEnergy(int ce) {
    	energyLevel = ce;
    	//System.out.println(energyLevel);
    	return energyLevel;
    }
    
    
}

