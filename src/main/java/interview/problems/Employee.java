package interview.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Employee implements Comparable<Employee>{
	String name,deptId;
	int salary;
	
	public Employee(String name,int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public void print() {
		System.out.println(this.name +"-->"+this.salary);
	}
	
	public static void main(String[] args) {
		Employee e1= new Employee("Rahul",1234);
		Employee e2= new Employee("Rohit",2345);
			
		HashSet <Employee> hs= new HashSet<Employee>();
		hs.add(e1);
		hs.add(e2);
        System.out.println(hs); 
        System.out.println(hs.size());//size will be 2 as it will print memory address
        ArrayList <Employee>al = new ArrayList<Employee>(hs);
        Collections.sort(al);
       
        for(Employee e:al) {
        	System.out.println("name: "+e.name+" and salary: "+e.salary);
        }
	}

//	@Override
//	public int compareTo(Employee o) {
//		if (this.salary>o.salary)
//			return 1;
//		else if(this.salary<o.salary)
//			return -1;
//		else
//		return 0;
//	}
	
//	@Override
//	public int compareTo(Employee o) {
//		return this.name.compareTo(o.name);
//	}
	
	@Override
	public int compareTo(Employee o) {
		return this.salary-o.salary;
	}
}
