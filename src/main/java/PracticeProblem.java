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
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println(bool1 && bool2);
		System.out.println(bool1 || bool2);

	}

	public static void q2() {
		//Write question 2 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a lowercase letter: ");
		char letter1 = input.nextLine().charAt(0);
		System.out.print("Input another lowercase letter: ");
		char letter2 = input.nextLine().charAt(0);
		System.out.println(letter1 < letter2);
		input.close();
	}

	public static void q3() {
		//Write question 3 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num1 = input.nextDouble();
		boolean result2 = num1 >= 0 && num1 <= 10;
		System.out.println(result2);
		input.close();
	}

	public static void q4() {
		//Write question 4 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a number: ");
		double num2 = input.nextDouble();
		boolean result3 = num2 > 0 && num2 != 5;
		System.out.println(result3);
		input.close();	
	}

	public static void q5() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Input a word: ");
		String word = input.nextLine();
		boolean result = !word.equals("banana");
		System.out.println(result);
		input.close();
	}

	public static void q6() {
		//Write question 5 code here
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int integer = input.nextInt();
		boolean result = integer % 2 == 0;
		System.out.println("The integer " + integer + " is " + result);
		input.close();
	}

}
