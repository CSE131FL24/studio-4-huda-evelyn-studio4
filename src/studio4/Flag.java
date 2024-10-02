package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.filledRectangle(0.5,0.5,0.22,0.26);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.38,0.54,0.07);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledCircle(0.62,0.54,0.07);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.38,0.54,0.04);
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledCircle(0.62,0.54,0.04);
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.38,0.54,0.025);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.filledCircle(0.62,0.54,0.025);
	}
}