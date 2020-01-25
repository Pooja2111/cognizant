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
res=l*w*h;
}
void getvolume()
{
System.out.println(res);
}
public static void main(String args[])
{
Volume v=new Volume();
v.setvolume(2,3,4);
v.getvoulme();
}
}
