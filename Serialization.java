package Employee;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{  
			    
			  Student1 s1 =new Student1(211,"ravi");  
			  //Creating stream and writing the object  
			  FileOutputStream fout=new FileOutputStream("D:cts.txt");  
			  ObjectOutputStream out=new ObjectOutputStream(fout);  
			  out.writeObject(s1);  
			  out.flush();  
			  //closing the stream  
			  out.close();  
			  System.out.println("success");  
			  }catch(Exception e){System.out.println(e);}  

	}

}
