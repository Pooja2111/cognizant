class Min
{
public static void main(String args[])
{
int min=0,max,i,temp;
int arr[]={5,2,5,3,6};
for(i=0;i<arr.length;i++)
{
if(arr[0]>arr[i])
{
temp=arr[0];
arr[0]=arr[i];
arr[i]=temp;
}
}
System.out.println(arr[0]);
for(i=0;i<arr.length;i++)
{
if(arr[0]<arr[i])
{
temp=arr[0];
arr[0]=arr[i];
arr[i]=temp;
}
}
System.out.println(arr[0]);
}
}
