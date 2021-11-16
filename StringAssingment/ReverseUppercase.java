package Stringlab;

public class ReverseUppercase {

	public static void main(String[] args) {
		 String str = "welcome to java";
		
		    String words[]=str.split("\\s");
	        String newString ="";
	        
	        for(String w: words){
	            String first = w.substring(0,1); 
	            String rest = w.substring(1);
	        
	            newString+=first.toUpperCase()+ rest+ " ";  
	        }  
	      
	        System.out.println(newString.trim());
	}

}
