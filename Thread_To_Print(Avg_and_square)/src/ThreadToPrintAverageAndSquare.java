/* Code Written by ISHA VATS */

/* Create two Threads.
 * Thread one is finding average of first 50 numbers
 * and thread two is printing square of array elements.*/


public class ThreadToPrintAverageAndSquare           //class ThreadToPrintAverageAndSquare
{

	public static void main(String[] args)          //main() class
	{
		
		
		/* Thread One Created to Calculate Average*/
		new Thread()                                
		{
			public void run()       
			{  
				int sum=0, avg = 0; 
				
				for(int i=1;i<=50;i++)
				{
					
					sum=sum+i;       //adding all numbers
					avg=sum/50;      //calculating average
					
				}
				
				/* Printing Average */
				System.out.println("Average of first 50 numbers is: "+avg);
			}
		}.start();     //Thread one Started
		
		
		
		/* Thread two Created to square of array elements*/
		new Thread()
		{
			public void run()
			{
				int[] arr= {2,3,4,5,6,7,8,9,10};
				
				System.out.println("Square of Array Number{2,3,4,5,6,7,8,9,10}: ");
				
			for(int i:arr)
			{ 
				/*Printing Square Using foreach loop*/
				System.out.println(i*i+" ");
				
			}
			}
		
		}.start();         //Thread two Started
		
	}

}
   /* END-OF-PROGRAM */