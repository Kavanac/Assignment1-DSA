import java.util.*;
public class Question8 {

	
		public static void printTwoElements(int[] arr, int n)
		{
			// sorting the array
			Arrays.sort(arr);
			System.out.print("The repeating element is ");
			for (int i = 0; i < n - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				System.out.println(arr[i]);
				break;
			}
			}

			System.out.print("and the missing element is ");
			for (int i = 1; i <= n; i++) {
			if (i != arr[i - 1]) {
				System.out.print(i);
				break;
			}
			}
		}

		public static void main(String[] args)
		{
			int[] arr = { 1,2,2,4 };
			int n = arr.length;
			printTwoElements(arr, n);
		}
		

		

	}

