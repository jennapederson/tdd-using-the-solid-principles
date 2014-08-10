package openClosed.after;

public class Triangle implements Shape {
	private int height;
	private int base;
	
	public Triangle(int height, int base) {
		this.height = height;
		this.base = base;
	}

	public int getHeight() {
		return height;
	}

	public int getBase() {
		return base;
	}

	public double area() {
		return base * height / 2.0;
	}
}
