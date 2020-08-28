//https://codeforces.com/problemset/problem/1303/A

/*You are given a string s. Each character is either 0 or 1.
You want all 1's in the string to form a contiguous subsegment. For example, if the string is 0, 1, 00111 or 01111100,
then all 1's form a contiguous subsegment, and if the string is 0101, 100001 or 11111111111101, then this condition is not met.
You may erase some (possibly none) 0's from the string. What is the minimum number of 0's that you have to erase?
*/

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ErasingZeroes {
	public static void main(String[]args)throws IOException{

			File file = new File("hh.txt");
			Scanner sc = new Scanner (file);

			int num = Integer.valueOf(sc.nextLine());

			for(int i =0; i<num; i++){
				String s = sc.nextLine();
				int x = s.indexOf('1');//first index of 1
				int y = s.lastIndexOf('1'); // last index of 1

				int count =0;
				for(int j = x+1; j<y; j++){
					if(s.charAt(j) =='0'){
						count++;
					}
				}
				System.out.println(count);
			}
			sc.close();
		}
	}

