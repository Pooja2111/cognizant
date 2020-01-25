package Employee;

import java.util.Comparator;

public class RegNum implements Comparator{
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Marks s1=(Marks)o1;  
		Marks s2=(Marks)o2;
		 
			
	if(s1.num==s2.num)
	{
		return 0;
	}
	if(s1.num>s2.num)
	{
		return 1;
	}
	else
	{
		return -1;
	}
}

}
