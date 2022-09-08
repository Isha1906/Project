/*Program to print Square of key to value in HashMap
 * */
import java.util.HashMap;            

import java.util.Map;               


public class HashMapForNumber {         //class HashMapForNumber

	public static void main(String[] args)     //main() class
	{
		HashMap<Integer,Integer> num=new HashMap<>();       //created a HashMap of Integer,Integer type
		
		for(int i=1;i<=15;i++)                          
		{
			num.put(i,i*i);                     //putting key(i) and value(i*i) into HashMap
		}
		System.out.println("Representation of HashMap:");
		

		for(Map.Entry n:num.entrySet())            
		{
		System.out.println(n.getKey()+" "+n.getValue());	 //printing HashMap key & value pair
		}
	}

	

}
