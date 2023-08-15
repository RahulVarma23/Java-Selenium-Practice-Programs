package string.problems;

public class IsoscelesTriangle {
	
	public static void checkTriangle(int x ,int y ,int z) {
		if( x==y && y==z) {
			System.out.println("Equilateral triangle");
		}else if(x==y || y==z || z==x){
			System.out.println("Isosceles triangle");
		} else
	        System.out.println("Scalene Triangle");
	}

	public static void main(String[] args) {
		checkTriangle(10,10,10);
	}
}
