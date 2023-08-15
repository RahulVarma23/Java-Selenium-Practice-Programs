
public class Student {
	 int count = 1;
	
	public Student () {
		System.out.println("This is object : "+count);
		count++;
	}
	
	
	public static void main(String[] args) {
		Student s = new Student();
		Student s1 = new Student();
		Student s2 = new Student();
	}
}
