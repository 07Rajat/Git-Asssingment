package collection_lab2;
import java.util.*;
public class Vector_even_odd {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(); 
		int sum;
		 for(int i=1; i<=20; i++)
		 { 
		  if(i%2==0)
		  { 
		    v.add(i);
		    System.out.print("  "+i);
		    
		   } 	
	}
		 System.out.println(" Even numbers are "+v);
	}
}

