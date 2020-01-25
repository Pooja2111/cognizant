class factorial
{
public static void main(String args[])
{
factorial a=new factorial();
a.factorial(6);
}
void factorial(int n)
{
int fact=1;
for(int i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
}




