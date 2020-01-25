package Employee;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Desc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			    
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("D:\\cts.txt"));  
			  Student1 s=(Student1)in.readObject();  
			    
			  System.out.println(s.stdid+" "+s.stdlocation);  
			  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  
	}

}
