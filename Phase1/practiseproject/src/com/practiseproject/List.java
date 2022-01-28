package com.practiseproject;

public class List {

			static int max_ref; 

			static int _list(int arr[], int n)
			{

				if (n == 1)
					return 1;

				int res, max_ending_here = 1;

				
				for (int i = 1; i < n; i++) {
					res = _list(arr, i);
					if (arr[i - 1] < arr[n - 1]
						&& res + 1 > max_ending_here)
						max_ending_here = res + 1;
				}

				
				if (max_ref < max_ending_here)
					max_ref = max_ending_here;

				
				return max_ending_here;
			}

			
			static int list(int arr[], int n)
			{
				
				max_ref = 1;

				
				_list(arr, n);

				
				return max_ref;
			}

			
			public static void main(String args[])
			{
				int arr[] = { 22, 5, 18, 23, 45, 56, 78, 12 };
				int n = arr.length;
				System.out.println("Length of list is " + list(arr, n)
								+ "\n");
			}
		
	}


