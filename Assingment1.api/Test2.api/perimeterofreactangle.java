package Atmpin;
import java.util.Scanner;
public class perimeterofreactangle {

	public static void main(String[] args) {
      float length,breath,result;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter Length");
      length=sc.nextFloat();
      System.out.println("Enter Breath");
      breath=sc.nextFloat();
      result=2*length+2*breath;
      System.out.println(result);
      
	}

}
