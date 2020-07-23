package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Dog d = new Dog();
        System.out.println(d.canHearWell);
        System.out.println(d.age);
        System.out.println(d.color);
        
         
        d.fetchthings();
        d.sleep();
	}

}
