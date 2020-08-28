//https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.*;
import java.util.Scanner;
public class Difference {
	public static void main(String[]args) throws IOException {

		File file = new File("difference.txt");

		Scanner sc = new Scanner(file);

		//how to read two dimesional array
		int num = Integer.valueOf(sc.nextLine());
		while(sc.hasNextLine()){
			int[][]arr = new int[num][num];
			for(int i =0; i <num; i++){
				String[]temp = sc.nextLine().split(" ");
				for(int j =0; j < num; j++){
					int item = Integer.valueOf(temp[j]);
					arr[i][j] = item;
			}
		}
			solve(arr);
		num = Integer.valueOf(sc.nextLine());
		}
	}

//	Find the difference between the diagonals of a given matrix

/*	1 2 3
	4 5 6
	9 8 9

	9+5+3 - (1+5+9) = 2
*/
	static void solve(int[][]arr){
		int n = arr.length;
		int sum1=0,sum2=0;
		int k,l,m;

		for(k=0,l=0,m=n-1; k<n;k++,l++,m--){
			sum1 =sum1 + arr[k][l];
			sum2 =sum2+ arr[k][m];
		}
		if(sum1 > sum2){
			System.out.println(sum1 -sum2);
		}else{
			System.out.println(sum2-sum1);
		}
	}
}
