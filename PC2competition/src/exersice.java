// https://www.cs.auckland.ac.nz/~mjd/prog_contest/problems/NZPC2015.pdf  problem D
import java.io.*;
import java.util.*;
public class exersice {

	public static void main(String[] args) throws IOException {
		File file = new File("exercise.txt");

		Scanner input = new Scanner(file);

		int count = 1;

		int n = Integer.valueOf(input.nextLine());

		while(input.hasNextLine()){
			int y = Integer.valueOf(input.nextLine());
			int[]pd = new int[y];

			for(int i =0; i < y; i++){
				pd[i] = Integer.valueOf(input.nextLine());
			}

			solve(n,pd, count);
			count++;
			n = Integer.valueOf(input.nextLine());
		}

	}
	public static void solve(int n, int[]pd, int count){
		System.out.println("User "+count);
		int result = 0;
		int x= 0;
		int y =0;
		for(int i=0; i <pd.length; i++){
			result = n * pd[i];
			x = result/100000;
			y = result%100000;

			System.out.println(x+"."+y);
		}
	}

}
