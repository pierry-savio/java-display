package entities;

public class Display {

	protected int xSize;
	protected int ySize;
	protected int speed;
	protected char defaultCharacter;
	
	public Display() {
	}
	
	public Display(int speed) {
		this.speed = speed;
		defaultCharacter = '.';
	}
	
	public Display(int xSize, int ySize, int speed) {
		this.xSize = xSize;
		this.ySize = ySize;
		this.speed = speed;
		defaultCharacter = '.';
	}
	
	public Display(int xSize, int ySize, int speed, char defaultCharacter) {
		this.xSize = xSize;
		this.ySize = ySize;
		this.speed = speed;
		this.defaultCharacter = defaultCharacter;
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
	
	public void showText(String txt, Double delay, int times) throws InterruptedException {
		
		String[][] display = new String[xSize + txt.length()][ySize];
		
		//fill up display
		display = fillDisplay(display);
		
		for (int i = 0; i<times; i++) {
		
			for (int x = xSize-1; x>=0; x--) {
				if (x<xSize-1) {
					display[x+1][ySize/2] = String.valueOf(defaultCharacter);
				}
				display[x][ySize/2] = txt;
				
				showDisplay(display);
				Thread.sleep(50);
				cleanScreen();
			}
			display = fillDisplay(display);
		}
	}
	
	private void showDisplay(String[][] display) {
		for (int y = 0; y<ySize; y++) {
			for (int x = 0; x<xSize; x++) {
				System.out.print(display[x][y]);
			}
			System.out.println();
		}
	}
	
	private String[][] fillDisplay(String[][] display) {
		for (int y = 0; y<ySize; y++) {
			for (int x = 0; x<xSize; x++) {
				display[x][y] = String.valueOf(defaultCharacter);
			}
		}
		return display;
	}
	
	private void cleanScreen() {
		for (int i = 0; i<60; i++) {
			System.out.println();
		}
	}
}
