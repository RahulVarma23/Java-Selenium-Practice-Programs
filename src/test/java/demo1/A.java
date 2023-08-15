package demo1;

public class A {


	 class B{
		public void m2() {
			System.out.println("m2");
		}
	}

	 public static void main(String[] args) {
		B b = new A().new B();
		b.m2();
		
	}
	

}
