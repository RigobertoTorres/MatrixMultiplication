
/**
 * This program accepts the number of rows and columns to create an array and then contains a method
 * to multiply 2 of these arrays
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ArrObj
{
    private int rows;
    private int columns;
    private int[][] array;
    /**
     * Constructor for objects of class ArrObj
     */
    public ArrObj()
    {
        rows = 0;
        columns = 0;
    }

    
    public ArrObj(int row, int column)
    {
        rows = row;
        columns = column;
        
    }
    
    public ArrObj(int[][] anArray)
    {
        setRows(anArray);
        setColumns(anArray);
        setArray(anArray);
    }
    
    public void setRows(int row)
    {
        rows = row;
    }
    
    public void setRows(int[][] anArray)
    {
        rows = anArray.length;
    }
    
    public void setColumns(int column)
    {
        columns = column;
    }
    
    public void setColumns(int[][] anArray)
    {
        columns = anArray[0].length;
    }
    
    public int getRows()
    {
        return rows;
    }
    
    public int getColumns()
    {
        return columns;
    }
    
    public int getElement(int x, int y)
    {
        return array[x][y];
    }
    
    
    
    public void setArray(int[][] anArray)
    {
        array = new int[anArray.length][anArray[0].length];
        for(int x = 0; x < anArray.length; x++)
        {
            for(int y = 0; y < anArray[0].length; y++)
            {
                array[x][y] = anArray[x][y];
            }
        }
    }
    
    public ArrObj multiply(ArrObj other)
    {
        int[][] temp = new int[other.getRows()][other.getColumns()];
        for(int y = 0; y < other.getColumns(); y++)
        {
            for(int x = 0; x < other.getRows(); x++)
            {
                temp[x][y] = other.getElement(x,y);
            }
        }
        
        int[][] result = new int[rows][other.getColumns()];
        
        if(canBeMultiplied(other))
        {
            /*
             * First for loop steps through the columns of anArray
             * x = current column of anArray
             */
            for(int x = 0; x < other.getColumns(); x++)
            {
                /*
                 * Third for loop steps through the rows of this array 
                 * w = current row of this array
                 */
                for(int w = 0; w < rows; w++)
                {
                    /*
                     * Second for loop steps through the rows of each column of anArray
                     * y = row of the current column of anArray
                     * (y will also end up equaling the columns of the current row of this array
                     */
                    int rowSum = 0;
                    for(int y = 0; y < other.getRows(); y++)
                    {
                        rowSum += (array[w][y] * temp[y][x]);
                    }
                    result[w][x] = rowSum;
                }
                
            }
        }
        else
        {
            System.out.println("I'm sorry, the dimensions you entered cannot be multiplied by the other arary");
        }
        
        ArrObj product = new ArrObj(result);
        return product;
    }
    
    public boolean canBeMultiplied(ArrObj other)
    {
        boolean canIt = false;
        
        if(rows == other.getColumns() && columns == other.getRows())
        {
            canIt = true;
        }
        else
        {
            canIt = false;
        }
        
        return canIt;
    }
    
    public String toString()
    {
        String toString = new String("");
        
        for(int i = 0; i < rows; i++)
        {
            for(int x = 0; x < columns; x++)
            {
               toString += (array[i][x] + " ");
            }
            toString += ("\n");
        }
        
        return toString;
    }
}
