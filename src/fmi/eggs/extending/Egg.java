package fmi.eggs.extending;

public class Egg {

	private String eggYolk = "Raw";
	private String eggWhite = "Raw";

	public Egg() {
		super();
	}
	public Egg(String eggYolk, String eggWhite) {
		super();
		this.eggYolk = eggYolk;
		this.eggWhite = eggWhite;
	}
	public String getEggYolk() {
		return eggYolk;
	}
	public void setEggYolk(String eggYolk) {
		this.eggYolk = eggYolk;
	}
	public String getEggWhite() {
		return eggWhite;
	}
	public void setEggWhite(String eggWhite) {
		this.eggWhite = eggWhite;
	}

}