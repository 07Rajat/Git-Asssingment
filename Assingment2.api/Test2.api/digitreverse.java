package Project4;
import java.util.Scanner;
public class digitreverse {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int a,b;
    a=sc.nextInt();
    while (a>0) 
    {
       b=a%10;
       System.out.print(b);
       a=a/10;
    }
	}

}
