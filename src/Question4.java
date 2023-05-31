import java.io.*;
import java.util.*;
public class Question4 {

	
		  static void AddOne(Vector<Integer> digits)
		  {  
		    int index= digits.size() - 1;
		  
		    while (index >= 0 && digits.get(index) == 9){
		      digits.set(index, 0);
		      index -= 1;
		    }
		  
		   
		    if (index < 0){
		      
		      digits.set(0, 1);
		      
		      digits.add(digits.size(),0);
		  
		    }
		    else
		      digits.set(index, digits.get(index) + 1);
		  
		  }
		 
		  public static void main(String[] args)
		  {
		    Vector<Integer> digits = new Vector<Integer>(Arrays.asList(1,2,3));
		    AddOne(digits);
		    for (int digit : digits)
		      System.out.print(digit + " ");
		  }
		

	}


