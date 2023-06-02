
public class HelloWorld {
	
	public void myMethod() {
		System.out.println("myMethod!!");
	}
	public int myCal() {
		System.out.println("myCal!!");
		return 101;
	}
	public String myName() {
		System.out.println("myName!!");
		return "error";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloWorld h = new HelloWorld();
		h.myMethod();
		h.myCal();
		h.myName();
		
		System.out.println("Hello World!!!");
		System.out.println("Hello Java!!");
	}

}
