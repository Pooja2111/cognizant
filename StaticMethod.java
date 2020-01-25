class StaticMethod 
{
  static int num=10;
  int a;
   void setStatic(int c)
  {
     num=c;
System.out.println(num);
}
void nonstatic()
{
System.out.println(num);
}
public static void main(String args[])
{ 
//System.out.println(num);
//setStatic(10);
StaticMethod d=new StaticMethod();
d.nonstatic();
}
}
