package ie.tudublin;

import processing.core.PApplet;

public class Arrays extends PApplet {

	private float[] rainFail = {45, 37, 55, 27, 38, 50, 79, 48, 104, 31, 100, 58};
	private String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	private float offset = 0;

    public void settings() {
        size(500, 500);
    }

	public void setup() {
		for (int i = 0; i < rainFail.length; i++) {
			
		}
    }

    public void keyPressed() {
        if (key == ' ') {

        }
    }

    public void draw() {
        background(0);
        colorMode(HSB);
    }
}
