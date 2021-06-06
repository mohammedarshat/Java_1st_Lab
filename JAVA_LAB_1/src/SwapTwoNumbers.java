public class SwapTwoNumbers {
	public static void main(String[] args) {
		int first = 120, second = 220;
		System.out.println("--Before swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
		// Value of first is assigned to temporary
		float temporary = second;
		// Value of second is assigned to first
		second = first;
		// Value of temporary (which contains the initial value of first) is assigned to
		// second
		first = (int) temporary;
		System.out.println("--After swap--");
		System.out.println("First number = " + first);
		System.out.println("Second number = " + second);
	}
}