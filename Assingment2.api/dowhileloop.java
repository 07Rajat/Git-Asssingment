package Project4;
import java.util.Scanner;
public class dowhileloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch;
		do {
			System.out.println("Enter first number: ");
			int a = sc.nextInt();
			System.out.println("Enter second number: ");
			int b = sc.nextInt();
			System.out.println();
			int c=a+b;
			System.out.println("sum is: " +c);
			
			System.out.println("Do you wanted to repeat loop again: ");
			ch = sc.next().charAt(0);
			System.out.println();
			
		}while (ch=='y'||ch=='Y');
		
sc.close();
	}
}

