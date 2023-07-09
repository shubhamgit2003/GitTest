package Main;

//import x.*;
//import Y.*;

public class Demo {
	
	public int a = 10;
	int b = 20;
	protected int c = 30;
	private int d = 40;
	
	public void show() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		disp();
	}
	
	public void disp() {
		System.out.println("................");
	}

	public static void main(String[] args) {
		System.out.println("Hello! testing for git...");
//		System.out.println("Now uploaded to GITHUB!");
		System.out.println("Again Git Push");
		System.out.println("This is the fourth commit...");
		
		new x.MyClass().meth();
		new Y.MyClass().meth();
		
//		new MyClass().meth();
		
		new Demo().show();
	}

}
