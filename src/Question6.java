
public class Question6 {

	
		  public static boolean
		    checkDuplicatesWithinK(int[] arr, int n, int k)
		  {
		 
		    
		    for (int i = 0; i < n; i++) {
		      int j = i + 1;
		      int range = k;
		      
		      while (range > 0 && j < n) {
		        if (arr[i] == arr[j]) {
		          return true;
		        }
		        j++;
		        range--;
		      }
		    }
		    return false;
		  }
		 
		  public static void main(String[] args)
		  {
		    int[] arr = { 1,2,3,1 };
		    int n = arr.length;
		    if (checkDuplicatesWithinK(arr, n, 3)) {
		      System.out.print("True");
		    }
		    else {
		      System.out.print("False");
		    }
		  }

	}


