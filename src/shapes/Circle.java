package shapes;



public class Circle extends Shape {
	private double radius;
	
	public Circle() {}

	public Circle(double radius) {
		
		this.radius = radius;
	}

	public Circle(String color, boolean filled, double radius) {
		setColor(color);
		setFilled(filled);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		return radius*radius*Math.PI;
	}
   public double getPerimeter() {
	   return 2*Math.PI*radius;
   }
	
   public double getDiameter() {
	   return 2*radius;
   }


public void printCircle() {
	System.out.println("Circle [radius=" + radius + "]");
}

}
