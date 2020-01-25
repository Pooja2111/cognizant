package Employee;

import java.util.Comparator;

public class RegName implements Comparator{
	public int compare(Object o1, Object o2) {
		Marks s1 = (Marks) o1;
		Marks s2 = (Marks) o2;
		return s1.name.compareTo(s2.name);
		/*if(s1.name==s2.name)
		{
			return 0;
		}
		if(s1.name.equals(s2.name))
		{
			return 1;
		}
		else
		{
			return -1;
		}*/
	}

}
