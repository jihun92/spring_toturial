package com.tutorialspoint;

public class Unit {
	
	private String name;
    private int attack;
    private int life;

    public Unit(String name, int attack, int life) {
    	this.name = name;
    	this.attack = attack;
    	this.life = life;
    }
    
    public void printUnitInformation() {
    	System.out.println("##### Print Unit Information #####");
    	System.out.println("## Name : " + name);
    	System.out.println("## Attack : " + attack);
    	System.out.println("## Life : " + life);
    	System.out.println("##################################");
    }

}