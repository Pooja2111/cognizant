class Student
{
int id;
double fees;
String branch,name;
void setstudent(int id,double fees,String name,String branch)
{
this.name=name;
this.id=id;
this.fees=fees;
this.branch=branch;
}
void getstudent()
{
System.out.println("id"+"\n"+id+"name"+name+"branch"+branch+"fees"+fees);
}
public static void main(String args[])
{
Student s=new Student();
s.setstudent(3,200,"pooja","cse");
s.getstudent();
}
}