package JavaBasics;

public class MethodOverloading {
	
	int add(int a, int b) {
		return(a+b);
		
	}
	int add(int a, int b, int c) {
		return(a+b+c);
	}
		 double add (double a, double b, double c) {
			return(a+b+c);
		}
		 
		 public static void main(String[] args) {
			MethodOverloading obj = new MethodOverloading();
			System.out.println(obj.add(2, 4));
			System.out.println(obj.add(2.3, 2.4, 2.8));
			System.out.println(obj.add(3, 3, 4));
		}
	
}