
public class Main {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 4;
		
		System.out.print("a=");
		System.out.println(a);

		System.out.print("b=");
		System.out.println(b);

		boolean aEqualsB = a == b;
		System.out.print("a==b :");
		System.out.println(aEqualsB);

		boolean aDiffersB = a != b;
		System.out.print(" a != b : ");
		System.out.println(aDiffersB);

		boolean aIsLessThanB = a < b;
		System.out.print(" a < b : ");
		System.out.println(aIsLessThanB);

		boolean aIsGreaterThanB = a > b;
		System.out.print(" a > b : ");
		System.out.println(aIsGreaterThanB);

		boolean aIsLessOrEqualThanB = a <= b;
		System.out.print(" a <= b : ");
		System.out.println(aIsLessOrEqualThanB);

		boolean aIsGreaterOrEqualThanB = a >= b;
		System.out.print(" a >= b : ");
		System.out.println(aIsGreaterOrEqualThanB);

	}

}
