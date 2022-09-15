/*  Code Written by ISHA VATS  */

/*Define class Employee with name,age,salary and id variables
 *ans sort it salary-wise(use comparable interface) */

import java.util.ArrayList;              
import java.util.Collections;            
import java.util.List;                    


/*  Class Employee Implementing Comparable interface */
class Employee implements Comparable<Employee>
{
	int id;
	String name;
	int age;
	float salary;  
	
/* Created Employee Parameterized Constructor */
	Employee(int id,String name,int age,float salary)
	{   
		/* Initialized values*/
		this.id=id;             
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
/* compareTo method used to compare salary*/
	public int compareTo(Employee e)
	{  
		//logic to sort/arrange Employee List according to salary
		if( salary==e.salary)             
		return 0;  
		
		else if( salary>e.salary)  
		return 1;  
		
		else  
		return -1;  
		}  
}
public class SortSalarywise             //class SortSalarywise
{

	public static void main(String[] args)       //main() class
	{
		List<Employee> emp=new ArrayList<Employee>();     //created List and passed Employee class
	     
		
		/* Adding values in Employee List emp*/
		emp.add(new Employee(101,"Varun   ",28,35000f));  
		emp.add(new Employee(105,"Deepak  ",25,28000f)); 
		emp.add(new Employee(107,"Geeta   ",24,24000f));
		emp.add(new Employee(111,"Garima  ",22,22000f));
		emp.add(new Employee(108,"Isha    ",22,23000f));
		emp.add(new Employee(121,"Maninder",23,25000f));
		
		
		/* Applying sort method on List emp*/
		Collections.sort(emp);  
		for(Employee e1:emp)       //Using foreach loop to print Sorted List
		{  
		System.out.println("Employee Name: "+e1.name+"  "+"Employee Age: "+e1.age+"  "+"Employee salary: "+e1.salary);  
		}  

	}
	/*   END-OF-PROGRAM   */

}
