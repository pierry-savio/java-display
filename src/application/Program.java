package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Display;
import entities.RegularDisplay;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Display display = new RegularDisplay();
		display.showText("Teste", 3.0, 0);
		scan.close();
	}
}
