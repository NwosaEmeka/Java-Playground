//https://www.codechef.com/COOK91/problems/CCOOK/

import java.io.*;
public class CookOff {
	public static void main(String[] args)throws IOException {
	
		BufferedReader br = new BufferedReader(new FileReader("cookoff.txt"));
		
		int t = Integer.parseInt(br.readLine());
		
		while (t -->0){
			String[] temp = br.readLine().split(" ");
			int num1 = Integer.parseInt(temp[0]);
			int num2 = Integer.parseInt(temp[1]);
			int num3 = Integer.parseInt(temp[2]);
			int num4 = Integer.parseInt(temp[3]);
			int num5 = Integer.parseInt(temp[4]);
			
			int[]arr = {num1,num2,num3,num4,num5};
			Solve(arr);
		}
		br.close();
	}
	static void Solve (int[]arr){
		int count =0;
		
		for(int i = 0; i< arr.length; i++){
			if(arr[i] == 1){
				count++;
			}
		}
		if (count == 0){
			System.out.println("beginner");
		}else if (count == 1){
			System.out.println ("junior developer");
		}else if (count == 2){
			System.out.println ("middle developer");
		}else if (count == 3){
			System.out.println ("senior developer");
		}else if (count == 4){
			System.out.println ("hacker");
		}else if (count == 5){
			System.out.println ("Jeff Dean");
		}
	}

}
