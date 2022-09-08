/*Create shape class and it has two child Circle and Square.
 * Both class have getArea() method to display area of that shape
 * Each class have getShape() method with different implementation
 * */

class Shape                    //Parent class Shape it has two child Class circle and square                 
{
	void display(){            //display method to to print a line
		{
			System.out.println("--Displaying area of circle and square--");
		}
	}
	
}          //End of parent class

class Square extends Shape            //Child class Square Inheriting properties of parent class
{  
	int side;                         //initialized variable side

	void getArea(int s)               //getArea() method to 
	{ 
	side=s;
	}
	void getShape()                   //getShape() method to print area of square
	{
	System.out.println("Area of square :"+(side*side) );
	}
	
}    //End of class square

class Circle extends Shape            //Child class Circle Inheriting properties of parent class
{
	int radius;                       //initialized variable radius

	void getArea(int r)               //getArea() method to 
	{ 
	radius=r;
	}
	void getShape()                   //getShape() method to print area of square
	{
	System.out.println("Area of Circle :"+(3.14*radius*radius) );
	}	
}            //End of class Circle

public class ShapeExample {             // class ShapeExample

	public static void main(String[] args)   //main() class
	{
		
		Shape shape=new Shape();           //Initialized object of parent class
		shape.display();                   
		
		Circle c=new Circle();             //Initialized object of class Circle
		c.getArea(5);                      
		c.getShape();
		
		Square s=new Square();             //Initialized object of class Square
		s.getArea(5);
		s.getShape();
	
	}      //End of main() class     

}
