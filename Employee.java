class Employee
{
int empid;
String empname;
int empsalary;
public Employee()
{
int empid=0;
String empname="0";
int empsalary=0;
}
public Employee(int empid,String empname,int empsalary)
{
this.empid=empid;
this.empname=empname;
this.empsalary=empsalary;
}
/*void setEmployee(int id,String name,int salary)
{
empid=id;
empname=name;
empsalary=salary;
}*/
void getEmployee()
{
System.out.println(empid+""+empname+""+empsalary);
}
}