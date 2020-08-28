
//https://www.cs.auckland.ac.nz/~mjd/prog_contest/problems/NZPC2015.pdf SET C

/*
Three toed sloth
6
27 = convert 27 to base 6
Octopus
8
126 convert 126 to octal
Hexapus
16
397 convert 397 to hexa
 */

import java.util.*;
import java.io.*;
public class conversion {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("hexa.txt"));

		String line = br.readLine();
		char[]key = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(!"#".equals(line)){
			int base = Integer.parseInt(br.readLine());
			int number = Integer.parseInt(br.readLine());
			solve(base, number, line, key);
			line = br.readLine();
		}

	}
	public static void solve (int base, int number, String line, char[]key){
		String answer = "";
		int rem = 0;
		int originalNumber = number;
		while (number >0){
			rem = number%base;
			answer = key[rem] + answer;
			number = number/base;
		}
		System.out.println(line +", "+originalNumber+", "+answer);
	}
}
