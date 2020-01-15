package fmi.eggs.interfaces;

import fmi.eggs.extending.BoilingProccess;

public interface CookingSteps {
	
	public void choosingPot(int eggCount);
	public void addingEggs(int eggCount);
	public void fillingThePot();
	public void boilingTheEggs(BoilingProccess b,int minutes);
	public void cleaningAfter(BoilingProccess b);
}
