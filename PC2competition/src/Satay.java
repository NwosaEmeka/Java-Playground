//https://www.acmicpc.net/problem/15838
import java.io.*;
import java.util.Scanner;
public class Satay {
	public static void main(String []args) throws IOException{
		double chic = 0.80 - ((7.5+8.0)/85);
		double beef = 1.0 - ((24.0+8.0)/85);
		double lamb = 1.2 - ((32.0+8.0)/85);
		double rice = 0.8 -0.2;

		File file = new File ("satay.txt");

		Scanner input = new Scanner(file);
		int nline = Integer.valueOf(input.nextLine());

		while(input.hasNextLine()){
		double price = 0.0;
		for(int i =1; i <= nline; i++){
			String line = input.nextLine();
			String[]temp = line.split(" ");
			int chickenPrice = Integer.valueOf(temp[0]);
			int beefPrice = Integer.valueOf(temp[1]);
			int lambPrice = Integer.valueOf(temp[2]);
			int ricePrice = Integer.valueOf(temp[3]);
		   price = price + (chickenPrice*chic)+(beef*beefPrice)+(lamb*lambPrice)+(rice*ricePrice);
		}
		System.out.printf("Case %01d: RM%.2f\n" ,nline,price);

		nline = Integer.valueOf(input.nextLine());

		}
		input.close();
		}
	}

