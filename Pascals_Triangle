package simplex;

import java.math.BigInteger;

public class Pascals_triangle
{
	public int ROW=0;
	public BigInteger[][] pascal  = new BigInteger[ (int) (ROW +1)][];
public Pascals_triangle(int dimension)
{
	ROW = dimension+2;
	 pascal  = new BigInteger[ROW +1][];
    pascal[1] = new BigInteger[1 + 2];
    pascal[1][1] = new BigInteger("1");
    for (int i = 2; i <= ROW; i++) {
        pascal[i] = new BigInteger[i + 2];
        for (int j = 1; j < pascal[i].length - 1; j++) 
        {
        
        	pascal[i][j] = pascal[i-1][j-1].add(pascal[i-1][j]) ;
        }
    }
    
    
    }

public BigInteger getface(int row,int column)
{
return pascal[row][column];	
}
}
