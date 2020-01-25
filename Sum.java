class Sum
{
public static void main(String args[])
{
int sum=0,avg=1,i;
int a[]={1,4,3,2,5};
for(i=0;i<a.length;i++)
{
sum=sum+a[i];
avg=sum/a.length;
}
System.out.println("sum=" +sum);
System.out.println("avg=" +avg);
}
}