package Employee;
class MyThread extends Thread
{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(100);
			}
			catch (InterruptedException e)
			{
			System.out.println(e);	
			}
		}
	}
}
public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1=new MyThread();
		t1.start();
		MyThread t2=new MyThread();
		t2.start();
		t1.destroy();
		
	}

}
