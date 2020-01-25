package Employee;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapClass {
	public static void main(String[] args)
	{
		Map map=new HashMap();
		map.put(1,"a");
		map.put(2, "b");
		map.put(3,"c");
		 Set set=map.entrySet();  
		    Iterator itr=set.iterator();  
		    while(itr.hasNext())
		    {  
		    	Map.Entry entry=(Map.Entry)itr.next();  
		        System.out.println(entry.getKey()+" "+entry.getValue());  
		    }
		map.remove(2);
		System.out.println(map);
	}

}
