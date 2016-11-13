/*Code Authored by --Lakshmana Deepesh--*/

/*
 * This code helps the user to find the number of individual faces of an n-Simplex when 
 * the dimension of the simplex is given as the input
 */
/*
 * This program can handle an input of range 0 to 100.The variables in the program are type casted
 * in such a way.
 */
/*
 * Any input out this range is considerd as an illegal entry and the code loops it self back
 * to the starting statement.
 * once the input given is intact and if it is in the range,then the code will start executing and it 
 * prints the faces of the n simplex on the console.
 */
package simplex;
import java.util.Scanner;
public class Simplex 
{
	static boolean x1=true;
public static void main(String[] args) 
{
	int k=0,count=0,count1=0;
	int Faces=0;
	@SuppressWarnings("resource")
	Scanner x	=new Scanner(System.in);
	
	
	while(x1)
	{
		System.out.println("Please enter the dimension of the Simplex(0 to 100):");
	while(!x.hasNextInt())
	{
		count1++;
		if(count1>=3)
    	{
    		System.out.println("ILLEGAL ENTRY!");
    		System.out.println("You have attempted: "+(count+count1)+" times.");
    		System.out.println("PLEASE CHECK THE FOLLOWING:");
    		System.out.println("-->Check if any illegal charecters are entered.");
    		System.out.println("please try again");
    	}
		
	System.out.println("ILLEGAL ENTRY,Please donot type Characters.");
	System.out.println("Enter Valid integers");
	x.next();
	System.out.println("Please enter the dimension of the Simplex(0 to 100):");
	}
    	count++;
    	if(count>=3)
    	{
    		System.out.println("ILLEGAL ENTRY");
    		System.out.println("You have attempted: "+(count+count1)+" times");
    		System.out.println("PLEASE CHECK THE FOLLOWING:");
    		System.out.println("-->The Range you have entered is out of bounds."
    				+ " The minimum value is 0 and the maximum value is 100.");
    		System.out.println("-->Check if any illegal charecters are entered.");
    		System.out.println("please try again");
    	}
	
	
	
		
	
	int Dimension = x.nextInt();
	Faces=Dimension+1;
	
	if(0>Dimension ||Dimension>100)
	{
		System.out.println("ERROR:Please enter the dimension of the simplex between 0 and 100");
	}
	
	else
	{
		x1=false;
		
		System.out.println("0-face:"+(Dimension+1));
		
		Pascals_triangle pt = new Pascals_triangle(Dimension,Faces);
		
		
				for(int j=0;j<Faces-1;Faces--)
		{	
			
			long Dface = pt.getface(Dimension+2, k+3);
			System.out.println((k+1)+"-faces:"+Dface);
			k++;
        }
		
}
	}
    };
}

