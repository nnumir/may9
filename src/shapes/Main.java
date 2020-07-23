package shapes;



public class Main {

	public static void main(String[] args) {
		
		Shape s= new Shape ("blue",true);
		
		Circle c = new Circle (34.5);
		Rectangle r =new Rectangle();
		
		System.out.println(c.isFilled());

	}

}
