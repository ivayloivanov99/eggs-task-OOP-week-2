package fmi.eggs.extending;

import fmi.eggs.interfaces.CookingActions;

public class CookingMug implements CookingActions{

	@Override
	public void pouringColdWater() {
		System.out.println("\nFilling the small mug with cold water...");
		
	}
	@Override
	public void cleaningThePot() {
		System.out.println("\nCleaning the small mug after eating the eggs...");
	}

	@Override
	public void coolingTheEggs() {
		System.out.println("\nFilling the small mug with cold water again and letting the eggs cool down...");	
	}
}