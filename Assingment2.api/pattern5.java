package Project4;
import java.util.Scanner;
public class pattern5 {

	public static void main(String[] args) {

		int a,b; 
		int oddNum=0,evenNum=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number  ");
		b=sc.nextInt();
		for(a=1; a<=b; a++){	
		if(a%2==0) 
		    evenNum=evenNum+a;
		else
		    oddNum=oddNum+a;
		} 
		System.out.println("Sum of digit odd numbers are: "+oddNum);
		System.out.println("Sum of digit even numbers are: "+evenNum);
sc.close();
	}
}
