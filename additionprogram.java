import java.util.*;

public class Addition {
	public static void main(String[] args) {
		int num1, num2, answer;

		Random rand = new Random();
		num1 = rand.nextInt(10);
		num2 = rand.nextInt(10);

		System.out.println(“What is “ + num1 + “ + “ + num2 + “ ? “);
		System.out.printf(“What is %d + %d “, num1, num2);
		Scanner scan = new Scanner(System.in)
		answer = scan.nextInt();
		
		if(num1 + num2 == answer) {
			System.out.println(“Correct!”);
		}
		else
			System.out.println(“Incorrect!”);
	}