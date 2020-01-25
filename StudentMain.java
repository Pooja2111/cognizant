package Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(new Student1(1, "HYD"));
		al.add(new Student1(2, "NZB"));
		al.add(new Student1(3, "CHENNAI"));
		System.out.println("Sorting by id");
		Collections.sort(al, new StudentId());
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student1 st = (Student1) itr.next();
			System.out.println(st.stdid + "" + st.stdlocation);
		}
		System.out.println("Sorting by name");
		Collections.sort(al, new StudentLocation());
		Iterator itr2 = al.iterator();
		while (itr2.hasNext()) {
			Student1 st = (Student1) itr2.next();
			System.out.println(st.stdid + " " + st.stdlocation);
}
		
		/*Collections.sort(al,(p1,p2)->{  
	        return p1.stdlocation.compareTo(p2.name);  
	        });  
	        for(Student1 p:al){  
	            System.out.println(p.id+" "+p.name+" "+p.price);  
	        }*/  

	}
}