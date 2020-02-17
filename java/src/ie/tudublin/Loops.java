package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet {

	private int sizeX = 500;
	private int sizeY = 500;
	private int centre = 250;

	public void settings()
	{
		size(sizeX, sizeY);
	}

	public void setup() {
//		colorMode(HSB);
//		drawThirdPattern();
		//drawRainbowCircle();
		drawGrid();
	}

	public void draw() {
		//drawFirstPattern();
		//drawCircle();
		//drawThirdPattern();
		//drawGrid();
	}

	private void drawThirdPattern() {
		int colorSelection = 0;

		for (int i = 0; i <500; i+=50) {
			fillNextColor(colorSelection++);
			rect(i, 0, 50, sizeY);
		}
	}

	private void drawRainbowCircle() {
		int colorSelection = 0;

		for (int i = 25; i <500; i+=50) {
			fillNextColor(colorSelection++);
			circle(i, centre, 50);
		}
	}

	private void drawCircle() {
		for (int i = 25; i < 500; i+= 50) {
			circle(i, centre, 50);
		}
	}

	public void drawFirstPattern() {
		for (int i = 0; i < 520; i+= 20) {
			line(centre, centre, i, 0);
			line(centre, centre, 0, i);

			line(centre, centre, 500, i);
			line(centre, centre, i, 500);
		}
	}

	public void drawGrid() {
		background(0);
		float gap = width * 0.1f;
		float textGap = gap / 2f;
		stroke(0, 255, 0);

		for (int i = -5; i <= 5; i++) {
			float x = map(i, -5, 5, gap, height - gap);

			text(i, x, textGap);
			line(x , gap, x, height - gap);

			text(i, textGap, x);
			line(gap, x, width - gap, x);
		}
	}

	private void fillNextColor(int colorSelection) {
		int[][] colors = {{255, 0, 0},
			{255, 105, 0},
			{255, 225, 53},
			{208, 255, 20},
			{106, 255, 77},
			{0, 255, 0},
			{152, 255, 152},
			{0, 255, 255},
			{102, 179, 255},
			{0, 0, 255}};

		fill(colors[colorSelection][0], colors[colorSelection][1], colors[colorSelection][2]);
	}
}
