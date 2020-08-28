import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ErasingZeroes {
	public static void main(String[]args)throws IOException{
		
			File file = new File("hh.txt");
			Scanner sc = new Scanner (file);
			
			int num = Integer.valueOf(sc.nextLine());
			
//			This program takes a number containing 1's and 0's then count the number of 0's between the 1's
//			010011 return 2 because 01__11 while 1111000 return 0 because there is no 0 between all the 1's
			for(int i =0; i<num; i++){
				String s = sc.nextLine();
				int x = s.indexOf('1');
				int y = s.lastIndexOf('1');
				
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

