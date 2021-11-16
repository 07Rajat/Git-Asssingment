package Stringlab;

import java.util.Scanner;

public class Comparetwo_String {
 
	public static void main(String[] args) {
          //System.out.println("");
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter total length");
          int n=sc.nextInt();
          int i,j;
          String temp=null;
          String a[] = new String [n];
          for(i=0;i<n;i++) {
        	  a[i]=sc.next();
          }
          for(i=0;i<n;i++) {
        	  for(j=i+1;j<n;j++) {
        		  if(a[i].compareTo(a[j])>0) {
        			  temp=a[i];
        			  a[i]=a[j];
        			  a[j]=temp;
        		  }
        	  }
          }
          System.out.println("lexicographically : ");
          for(i=0;i<n;i++) {
        	  System.out.println(a[i]);
          }
	}

}
