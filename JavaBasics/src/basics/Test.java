package basics;

public class Test {

	public static void main(String[] args) {
		
		Bicycle bike1 = new Bicycle(1,3,5);
		Bicycle bike2 = new Bicycle(1,3,5);
		
		System.out.println("Hashcode");
		System.out.println(bike1.hashCode());
		System.out.println(bike2.hashCode());
		System.out.println("To String");
		System.out.println(bike1.toString());
		System.out.println(bike2.toString());
		System.out.println("Equals");
		System.out.println(bike1.equals(bike2));
		
	}

}
