package Stringlab;

public class stringcharacter {

	public static void main(String[] args) {
	/*	String s = new String("Rajat");
		System.out.println(s.indexOf("a"));
	*/	
		String str = "Rajat";
		int index = 3;
		stringcharacter.getchar(str, index);
		

	}

	private static void getchar(String str, int index) {
		String userString = str;
		int userIndex=index;
		//System.out.println(" UserString :"+userString +" UserIndex :"+userIndex);
		char [] ArString = userString.toString().toCharArray();
 		for(int i=0;i<ArString.length;i++) {
 			if(i==userIndex) {
			//System.out.println(" Index "+i+" Value "+ArString[i]);
			System.out.println(" Character :"+ArString[i]+"\n Index :"+i);
 			}
		}
	}

}
