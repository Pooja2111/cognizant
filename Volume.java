class Volume
{
int l,w,h;
void setvolume(int l,int w,int h)
{
this.l=l;
this.w=w;
this.h=h;
}
void cal()
{
int res;
res=l*w*h;
System.out.println(res);
}
void getvolume()
{
System.out.println("the result is:");
cal();
}
public static void main(String args[])
{
Volume v=new Volume();
v.setvolume(4,3,4);
v.getvolume();
}
}
