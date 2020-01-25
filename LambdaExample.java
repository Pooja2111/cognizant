package Employee;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

class Employee1{  
    int empid,empsalary;
    String empname;  
    
    public Employee1(int empid, int empsalary, String empname) {
		super();
		this.empid = empid;
		this.empsalary = empsalary;
		this.empname = empname;
	}
}  
public class LambdaExample {

	public static void main(String[] args) {
		 
          ArrayList<Employee1> list=new ArrayList<Employee1>();
            list.add(new Employee1(101,20000,"xyz"));  
	        list.add(new Employee1(100,30000,"pqr"));  
	        list.add(new Employee1(103,2000,"abc"));  
	          
	        Collections.sort(list,(p1,p2)->
	        {  
	        return p1.empname.compareTo(p2.empname);  
	        });  
	        /*for(Employee1 p:list)
	        {  
	            System.out.println(p.empid+" "+p.empname+" "+p.empsalary);  
	        } */ 
	        Stream<Employee1>data=list.stream().filter(p -> p.empsalary > 20000);  

	}

}
