package SuperConstructor;

public class SuperClass {

	 class A()
	 {
		 A()
		 {
			 //super();
			 System.out.println("A()");
		 }
	 }
	 class B extends class A
	 {
		 B()
		 {
			 //super();
		 
		 System.out.println("B()");
		 }}
	 }
	 public class SuperConstructor
	 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
		B b=new B();
	}

}
