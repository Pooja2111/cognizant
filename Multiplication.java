class Multiplication
{
public static void main(String args[])
{
int a[][]={{1,2},{4,5}};
int b[][]={{2,3},{1,4}};
int i,j,k;
int c[][]=new int[2][2	];
for(i=0;i<a.length;i++)
{
for(j=0;j<b.length;j++)
{
c[i][j]=0;
for(k=0;k<c.length;k++)
{
c[i][j]+=a[i][k]*b[k][j];
}
System.out.print(c[i][j]);
System.out.println();
}
}
}
}
