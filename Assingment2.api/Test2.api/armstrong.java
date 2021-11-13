package Project4;
import java.util.Scanner;
public class armstrong {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number");
    int a,b=0,c,d;
   a=sc.nextInt();
   d=a;
   while(a>0)
   {
	   c=a%10;
	   b=(c*c*c)+b;
	   a=a/10;
	   
   }
   if(d==b) System.out.print("Armstrong Number");
   else System.out.print("Not Armstrom Number");
	}

}
