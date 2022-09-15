/*  Code Written by ISHA VATS  */

/*Define class Student with id,age,name and maths_marks variables
 *and print marks between(60-80) range */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* created class Student*/
class Student
{
	int id;
	String name;
	int age;
	int maths_marks;
	
	/* Created Student Parameterized Constructor*/
	Student(int id,String name,int age,int maths_marks)
	{
		/* Initialized Values */
		this.id=id;
		this.name=name;
		this.age=age;
		this.maths_marks=maths_marks;
	}
}
public class StudentsMathsMarks {              //class StudentMathsMarks

	public static void main(String[] args)   //main() class
	{
		
		/* Created List and passed Student class*/
		List<Student> stu=new ArrayList<>();
		
		/* Adding values*/
		stu.add(new Student(1,"Diya",15,65));
		stu.add(new Student(2,"Diya",16,78));
		stu.add(new Student(3,"Diya",15,60));
		stu.add(new Student(4,"Diya",16,59));
		stu.add(new Student(5,"Diya",17,88));
		stu.add(new Student(6,"Diya",17,80));
		stu.add(new Student(7,"Diya",15,90));
		
		/* Created another List maths to store filtered marks between(60-80) range
		 * used filter() method and passed a condition to check marks 
		 */
		List maths=stu.stream().filter(m->(m.maths_marks>=60 && m.maths_marks<=80)).map(m1->m1.maths_marks).collect(Collectors.toList());
		
		/*Printing Marks b/w (60-80) range*/
		System.out.println("Marks of Studenrs between(60-80): "+maths);

	}

}
   /*END-OF-PROGRAM*/
