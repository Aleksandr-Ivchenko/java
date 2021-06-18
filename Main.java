//                          задание 1
//package com.company;
//
//
//public class Main {
//	public static void main(String[] args) {
//		int[] arr = {0, 1, 0, 0, 1, 0, 1,};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print (i + "-" + arr[i]+" ");
//		}
//		System.out.println("  ");
//		for(int i = 0; i < arr.length; i++)
//			if(arr[i] == 1) {
//				arr[i] = 0;
//			}else arr[i] = 1;
//		for(int i = 0; i < arr.length; i++){
//			System.out.print (i + "-" + arr[i]+" ");
//		}
//	}
//}
////_________________________________________________________________________
////                       задание 2
//package com.company;
//public class Main {
//	public static void main(String[] args) {
//		int[] arr = new int[100];
//		for(int i = 0; i < 100; i++) {
//			arr[i] = i+1;
//			System.out.println("[" + i + "] = " + arr[i]);
//		}
//	}
//}
////______________________________________________________________________
////                         задание 3
//package com.company;
//public class Main {
//	public static void main(String[] args) {
//		int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
//		int stringArr = arr.length;
//		for(int i = 0; i < stringArr; i++){
//			System.out.print (i + "[" + arr[i]+"] ,");
//		}
//		System.out.println("  ");
//		for(int i = 0; i < stringArr; i++) {
//			if (arr[i] < 6) arr[i] = arr[i] * 2;
//		}
//		for(int i = 0; i < stringArr; i++)
//		{
//			System.out.print (i + "[" + arr[i]+"] ,");
//		}
//	}
//}
////_________________________________________________________________________
////                             задание 4
//package com.company;
//public class Main {
//	public static void main(String[] args) {
//		final int n =15;
//		int[][] arr = new int[n][n];
//		for (int i = 0; i < n; ++i)
//			for (int j = 0;j <n;++j)
//				if(i==j ) arr[i][j] =1 ;
//				else if ( i+j == n-1) arr[i][j]=1;
//				else arr[i][j] =0;
//		for (int i = 0; i < n; ++i) {
//			for (int j=0;j<n;++j)
//				System.out.print(arr[i][j] +"  ");
//			System.out.print("\n");
//		}
//
//	}
//}
////_________________________________________________________________________
////                             задание 5
//package com.company;
//public class Main {
//
//	public static void main(String[] args) {
//		 int len = 14;
//		 int initialValue =95;
//		int arr[] = new int[len];
//		for (int i = 0; i <len; i++) {
//			arr[i] = initialValue;
//			System.out.print("[" + i +"]"+ arr[i] + "  ");
//		}
//	}
//}
//_________________________________________________________________________
//                             задание 6
//package com.company;
//import java.util.Arrays;
//
//public class Main {
//
//	public static void main(String[] args) {
//		int[]arr = {2,54,4,12,38,8,-45,17,96,6,41,32};
//
//				int max = arr[0];
//				int min = arr[0];
//				for (int i = 0; i < arr.length; i++) {
//					if (arr[i] > max) {
//						max = arr[i];
//					}
//				}
//				for (int i = 0; i < arr.length; i++) {
//					if (arr[i] < min) {
//						min = arr[i];
//					}
//				}
//				System.out.println(max);
//				System.out.println(min);
//			}
//		}