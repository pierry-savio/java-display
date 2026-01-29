package entities;

public class RegularDisplay extends Display {
	
	public RegularDisplay() {
	}

	public RegularDisplay(int xSize, int ySize, int speed) {
		super(xSize, ySize, speed);
		this.xSize = 100;
		this.ySize = 20;
	}
	
	public RegularDisplay(int speed) {
		super(speed);
		this.xSize = 100;
		this.ySize = 20;
	}
}
