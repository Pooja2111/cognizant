package Employee;

import java.io.FileOutputStream;

public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		FileOutputStream fout=new FileOutputStream("D:\\cts.txt");
	    fout.write(69);    
        fout.close();    
        System.out.println("success...");    
       }catch(Exception e){System.out.println(e);}    
 }    


}
