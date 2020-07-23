package shapes;

import java.util.Date;

public class Shape {

	private String color="white";
	private boolean filled=false;
	private Date dateCreated;
	
	public Shape (String color, boolean filled) {
		
		this.color = color;
		this.filled = filled;
		dateCreated=new Date();
		
	}
	public Shape () {}
		
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	
	public String toString() {
		return "Shape [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}
	
}
