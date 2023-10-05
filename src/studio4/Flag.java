package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.25);
		
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.filledSquare(0.5, 0.5, 0.2);
		
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.filledRectangle(0.15, 0.5, 0.05, 0.25);
		StdDraw.filledRectangle(0.85, 0.5, 0.05, 0.25);
	
		
		

		
	}
}