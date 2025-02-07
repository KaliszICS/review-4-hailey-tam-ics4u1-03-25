import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		//Write question 1 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String num = in.nextLine();
		System.out.println(Integer.parseInt(5 + num)+5);
	}

	public static void q2() {
		//Write question 2 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		String num2 = in.nextLine();
		System.out.println(Double.parseDouble(5 + 3 + num2)+ 3.2);
	}

	public static void q3() {
		//Write question 3 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String bool = in.nextLine();
		System.out.println(!Boolean.parseBoolean(bool));
	}

	public static void q4() {
		//Write question 4 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a integer: ");
		String num4 = in.nextLine();
		System.out.println((char)(Integer.parseInt(num4 + 3) + 2));
	}

	public static void q5() {
		//Write question 5 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a integer: ");
		String num5 = in.nextLine();
		System.out.println((double)(Integer.parseInt(num5 + 1)/2));
	}

	public static void q6() {
		//Write question 6 code here
		Scanner in = new Scanner(System.in);
		System.out.print("Input a integer: ");
		String num6 = in.nextLine();
		System.out.println((int)(Double.parseDouble(1 + num6)));
	}

}
