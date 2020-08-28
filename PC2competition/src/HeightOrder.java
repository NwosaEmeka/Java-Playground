//https://www.hackerrank.com/contests/round-1-acm-icpc-warmup-2015/challenges/height-ordering

import java.io.*;
public class HeightOrder {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("HeightOrder.txt"));
		int t = Integer.parseInt(br.readLine()); //read the number of cases "4"

		while(t-->0){ //while t is > than 0, do then decrease t by 1 "while(t>0, t--)

			String[] temp = br.readLine().split(" "); //put the text in a string array called temp..bear in mind of space
			int num = Integer.parseInt(temp[0]);//the first int is the test case number;
			int size = 20;
			int[]arr = new int[size];//create an array to hold the
			int i, j;
			for(i = 0, j =1; i <size; i++,j++){
				arr[i] = Integer.parseInt(temp[j]);
			}
			solve(arr,num);
		}
		br.close();

	}
	static void solve (int[]arr,int num){
		int n = arr.length;
	      int numberOfStepBack = 0;
	      for(int i = 0; i < n; i++){
	    	  for(int j = i+1; j < n; j++){
	    	  if(arr[j] < arr[i]){

	    		 int temp = arr[i];
	    		 arr[i] = arr[j];
	    		 arr[j] = temp;
	    		 numberOfStepBack += (n-j);
//	    		 System.out.println(numberOfStepBack);
	    		 break;

	    	  }
	    	  }
	      }
	      System.out.println(num +" " +numberOfStepBack);
	}

}
