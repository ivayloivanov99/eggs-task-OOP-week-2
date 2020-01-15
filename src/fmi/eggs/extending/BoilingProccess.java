package fmi.eggs.extending;

import java.util.ArrayList;
import fmi.eggs.interfaces.CookingSteps;

public class BoilingProccess extends Egg implements CookingSteps{
	private ArrayList<Egg> totalEggs = new ArrayList<Egg>();
	private int counter = 0;				
	
	@Override
	public void choosingPot(int eggCount) {
		System.out.println("\nPicking "+ eggCount + " eggs and washing them with water...");
		if(eggCount >= 5) {				
			System.out.println("\nThere are 5 or more eggs, so we are going to use the big pot.");
			counter++;		
		}else {			
			System.out.println("\nThere are less than 5 eggs, so we are going to use the small mug.");
			counter--;
		}			
	}
	
	@Override
	public void fillingThePot() {
		
		if(counter>0) {
			CookingPot pot = new CookingPot();
			pot.pouringColdWater();
		}else {
			CookingMug pot = new CookingMug();
			pot.pouringColdWater();
		}
	}

	@Override
	public void addingEggs(int eggCount) {
		Egg eggs = new Egg();
		totalEggs.add(eggs);
		if(counter>0) {
	
			System.out.println("\nPutting the " + eggCount +" eggs inside the big pot...");
		}else {
			System.out.println("\nPutting the " + eggCount +" eggs inside the small mug...");
		}
	}
	
	@Override
	public void boilingTheEggs(BoilingProccess b, int minutes) {
		System.out.println("\nStarting to boil the eggs for exactly "+ minutes + " minutes...");
		if(minutes > 3 && minutes < 5) {
			b.setEggWhite("Cooked");
			System.out.println("\n----------------------\nThe egg yolk is: " + b.getEggYolk()
								+ "\nThe egg white is: "+ b.getEggWhite()+"\n----------------------\n");
		}else if(minutes >=5) {
			b.setEggWhite("Cooked");
			b.setEggYolk("Cooked");
			System.out.println("\n----------------------\nThe egg yolk is: " + b.getEggYolk()
			+ "\nThe egg white is: "+b.getEggWhite()+"\n----------------------\n");
		}else {
			System.out.println("\n----------------------\nThe egg yolk is: " + b.getEggYolk()
			+ "\n----------------------\nThe egg white is: "+b.getEggWhite()+"\n----------------------\n");
		}
	}
	
	@Override
	public void cleaningAfter(BoilingProccess b) {
		if(counter>0) {
			CookingPot pot = new CookingPot();
			pot.coolingTheEggs();
			pot.cleaningThePot();
		}else {
			CookingMug pot = new CookingMug();
			pot.coolingTheEggs();
			pot.cleaningThePot();
		}
	}
}