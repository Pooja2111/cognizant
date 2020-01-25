package Employee;

import java.util.Comparator;

public class StudentLocation implements Comparator {


	public int compare(Object o3, Object o4) {
		Student1 s1=(Student1)o3;  
		Student1 s2=(Student1)o4; 
		return s1.stdlocation.compareTo(s2.stdlocation);  
	}

}
