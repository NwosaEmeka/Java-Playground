//https://www.cs.auckland.ac.nz/~mjd/prog_contest/problems/NZPC2015.pdf  problemB

import java.util.*;
import java.io.*;
public class Password1 {

	public static void main(String[] args) throws IOException{
		File file = new File ("password1.txt");
		Scanner sc = new Scanner(file);

		int num = Integer.valueOf(sc.nextLine());
		int num2 = Integer.valueOf(sc.nextLine());
		String[]line = new String[num2];
		for(int i = 0; i < num; i++){
			System.out.println("Customer "+(i+1));
			for(int j = 0; j< num2; j++){
			line[j] = sc.nextLine().replace(" ", "");

		}
			int num3 = Integer.valueOf(sc.nextLine());
			int a =0,b=0,c=0;
			for(int k =0; k < num3; k++){
				String line2 = sc.nextLine();
				String[]temp = line2.split(" ");
				a = Integer.valueOf(temp[0]);
				b = Integer.valueOf(temp[1]);
				c = Integer.valueOf(temp[2]);
				String d = temp[3];
				String e = temp[4];
				solve(a,b,c,d,e,num2,line);
			}

		}
	}
	public static void solve(int a, int b, int c, String d,String e,int num2,String[]line){
		String x ="";

			if(a == 1){
				x = line[0];
				char y = x.charAt(b-1);
				char v = x.charAt(c-1);
				char m = d.charAt(0);
				char n = e.charAt(0);
				if(y == m && v == n){
					System.out.println("correct");
				}else{
					System.out.println("error");
				}

			}else if (a == 2){
				x = line[1];
				char y = x.charAt(b-1);
				char v = x.charAt(c-1);
				char m = d.charAt(0);
				char n = e.charAt(0);
				if(y == m && v == n){
					System.out.println("correct");
				}else{
					System.out.println("error");
				}

			}else if (a== 3){
				x = line[2];
				char y = x.charAt(b-1);
				char v = x.charAt(c-1);
				char m = d.charAt(0);
				char n = e.charAt(0);
				if(y == m && v == n){
					System.out.println("correct");
				}else{
					System.out.println("error");
				}
		}
	}

}
