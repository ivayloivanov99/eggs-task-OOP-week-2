package fmi.eggs.extending;

public class Cooker {

	public static void main(String[] args) {
				
		int totalEggs = 8;   // Number of eggs that we are going to boil.						
		int timer = 4;      //Timer for boiling the eggs
		
		BoilingProccess b = new BoilingProccess();
		b.choosingPot(totalEggs);    
		b.addingEggs(totalEggs);
		b.fillingThePot();
        b.boilingTheEggs(b, timer);
        b.cleaningAfter(b);        	
	}
}