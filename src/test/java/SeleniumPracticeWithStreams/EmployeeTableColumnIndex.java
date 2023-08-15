package SeleniumPracticeWithStreams;

public enum EmployeeTableColumnIndex {
	
	NAME(2),
	POSITION(3),
	OFFICE(4),
	AGE(5),
	SALARY(6);
	
	int index;
	
	EmployeeTableColumnIndex(int index){
		this.index=index;
	}
	
	public int getIndex() {
		return index;
	}

}
