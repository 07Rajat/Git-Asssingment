package Project4;
import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		 int i,j=0,k=1,n;
		 i=sc.nextInt();
		 for(int a=1;a<=i;a++)
		 {
			 System.out.print(j+" ");
			 n=j+k;
			 j=k;
			 k=n;
			 
		 }

	}

}
