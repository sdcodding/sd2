package project_one;

import java.util.Comparator;

public class RollComparator implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		
		if(s1.getRollNo()==s2.getRollNo()) {
			return s1.getName().compareTo(s2.getName());
		}
		else if(s1.getRollNo()>s2.getRollNo()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
	
	
	
}
