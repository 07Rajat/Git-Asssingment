package collection_lab2;
import java.util.*;
public class CompareLinklist {

	public static void main(String[] args) {
		List<Integer> l= new LinkedList<Integer>();
		l.add(12);
		l.add(63);
		l.add(45);
		l.add(25);
		l.add(10);
		System.out.println(l);
		TreeSet <Integer> t = new TreeSet<Integer>();
		t.add(12);
		t.add(63);
		t.add(45);
		t.add(25);
		t.add(10);
		System.out.println(t);
		HashSet <Integer> h = new HashSet <Integer>();
		h.add(12);
		h.add(63);
		h.add(45);
		h.add(25);
		h.add(10);
		System.out.println(h);
		
	}

}
