package shapes;

public class Rectangle extends Shape {

	private double width;
	private double hight;
	
	public Rectangle() {}

	public Rectangle(String color, boolean filled, double width, double hight) {
		setColor(color);
		setFilled(filled);
		this.width = width;
		this.hight = hight;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHight() {
		return hight;
	}

	public void setHight(double hight) {
		this.hight = hight;
	}
	public double getArea() {
		return width*hight;
	}
	public double getperimeter() {
		return 2*(width+hight);
	}
}
