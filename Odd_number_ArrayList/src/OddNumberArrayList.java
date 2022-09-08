/*Asking user to enter arraylist elements and Printing odd numbers from the arraylist
 * if the user enter or press 0 , user will not be able to enter more elements 
 * */
import java.util.ArrayList;
import java.util.Scanner;

public class OddNumberArrayList {              //class OddNumberArrayList

	public static void main(String[] args)        //main() class
	
	
	{
		ArrayList<Integer> odd=new ArrayList<>();         //ArrayList to store odd numbers
		
		ArrayList<Integer> normal_list=new ArrayList<>();        //ArrayList to store elements entered by the user
		
		Scanner sc=new Scanner(System.in);
		
	    int num=Integer.MAX_VALUE ;             /*initializing variable num and assigning
	                                             *it Integer Max Value*/
	                                              
	    //Giving warning to user about what will happen if 0 is entered
	    System.out.println("!!!After you enter 0 , you will not be able to enter elemnets further in the list");
        
	    
	    //asking user to enter elements
	    System.out.println("Enter ArrayList elements:");
       
        while(num!=0)                //applying condition 
        {  
          num=sc.nextInt();           
          
          normal_list.add(num);          //adding element to list
        
        } 
        
        for(int i=0;i<normal_list.size();i++)        
        {
        	if(normal_list.get(i)%2!=0)                    /*condition applied in which if
        	                                                *element in normal-list doesn't
        	                                                *remainder 0 */
        	{
        		odd.add(normal_list.get(i));              //element will be added to odd arraylist
        	}
        	
        }
        odd.forEach(n-> System.out.print(n+" "));         //printing odd ArrayList
        
	}
}
