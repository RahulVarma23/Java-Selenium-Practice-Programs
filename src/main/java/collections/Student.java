package collections;

import java.util.*;


public class Student implements Comparable<Student> {

	String name;
	int age;
	int rollNo;

	public Student(String name, int age, int rollNo) {
		this.name = name;
		this.age = age;
		this.rollNo= rollNo;
	}


	public static void main(String[] args) {
		Student s1 = new Student("Rahul", 30, 20);
		Student s2 = new Student("Sid", 40, 10);
		Student s3 = new Student("Ankita", 50, 30);

		List<Student> list = Arrays.asList(s1, s2, s3);

		Collections.sort(list);

		for(Student s :list) {
			System.out.println(s.name +"->"+s.age+"->"+s.rollNo);
		}


	}

	@Override
	public int compareTo(Student s) {
		return this.name.compareTo(s.name);
	}
}
