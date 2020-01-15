package fmi.eggs.extending;

import fmi.eggs.interfaces.CookingActions;

public class CookingPot implements CookingActions{

	@Override
	public void pouringColdWater() {
		System.out.println("\nFilling the big pot with cold water...");		
	}

	@Override
	public void cleaningThePot() {
		System.out.println("\nCleaning the big pot after eating the eggs...");
		
	}

	@Override
	public void coolingTheEggs() {
		System.out.println("\nFilling the big pot with cold water again and letting the eggs cool down...");	
	}
}