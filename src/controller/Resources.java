package controller;

public class Resources {
	
	private int iron;
	private int gunPowder;
	private int wood;
	
	public Resources() {
		iron = 0;
		gunPowder = 0;
		wood = 0;
	}
	
	public int getIron() {
		return iron;
	}
	public void setIron(int iron) {
		this.iron = iron;
	}
	public int getWood() {
		return wood;
	}
	public void setWood(int wood) {
		this.wood = wood;
	}
	public int getGunPowder() {
		return gunPowder;
	}
	public void setGunPowder(int gunPowder) {
		this.gunPowder = gunPowder;
	}
	

}
