package Employee;

import java.util.Comparator;

public class StudentId implements Comparator{

	
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student1 s1=(Student1)o1;  
		Student1 s2=(Student1)o2;
		 
			
	if(s1.stdid==s2.stdid)
	{
		return 0;
	}
	if(s1.stdid>s2.stdid)
	{
		return 1;
	}
	else
	{
		return -1;
	}
}
}