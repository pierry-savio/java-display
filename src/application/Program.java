package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Display;
import entities.RegularDisplay;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Display display = new RegularDisplay(50,1,10);
		display.showText("Que legal mano akakkaka", 3.0, 10);
		scan.close();
	}
}
