package entities;

public class Display {

	protected int xSize;
	protected int ySize;
	protected int speed;
	
	public Display() {
	}
	
	public Display(int xSize, int ySize, int speed) {
		this.xSize = xSize;
		this.ySize = ySize;
		this.speed = speed;
	}
	
	public int getXSize() {
		return xSize;
	}
	
	public void setXSize(int xSize) {
		this.xSize = xSize;
	}
	
	public int getYSize() {
		return ySize;
	}
	
	public void setYSize(int ySize) {
		this.ySize = ySize;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void showText(String txt, Double delay, int times) {
		//TODO showText implementation
	}
}
