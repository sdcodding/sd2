package project_one;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private int rollNo;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Student st=(Student)obj;
		return st.name.equals(this.name)&&st.rollNo==this.rollNo;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode();
		
		
	}
	
	
	
	
	
		
	
}
