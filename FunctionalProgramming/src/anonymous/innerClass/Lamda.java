package anonymous.innerClass;

public class Lamda {

	public static void main(String[] args) {
		A a;
		a=new A() //anonymous inner class
		{
			
	
			public void show() {
				System.out.println("print anonymous inner class");
				
			}
		};
		a.show();
	

	}

}
