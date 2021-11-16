package collection_lab2;
import java.util.*;
public class VectorExample {

	public static void main(String[] args) {
		Vector l = new Vector();
		l.add(" Rajat ");
		l.add(" Ram ");
		l.add(" Raju ");
		l.add(" Vivek ");
		l.add(" Shyam ");
		l.add(" Raka ");
		
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		System.out.println("Hash code :"+ l.hashCode());
		System.out.println(l.get(0));
		System.out.println(l.get(2));
		System.out.println("size of vector list is : "+l.size());
		System.out.println("capacity of vector list is : "+l.capacity());
		l.add(null);
		System.out.println("Null  is added" + l);
		System.out.println("Index of Null in vectorlist is " + l.indexOf(null));
		l.insertElementAt("Ashu", 3);
		System.out.println("insert element is Ashu "+l);
		l.remove(0);
		System.out.println("Remove Rajat from vector list "+l);
	}

}
