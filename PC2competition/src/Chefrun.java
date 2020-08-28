
//https://www.codechef.com/COOK94B/problems/CHEFRUN

import java.util.Scanner;
import java.io.*;
public class Chefrun {
	public static void main (String[]args) throws IOException{
		File file = new File("chefrun.txt");
		Scanner sc = new Scanner (file);

		int num = Integer.valueOf(sc.nextLine());

		for(int i =0; i < num; i++){
			String[]temp = sc.nextLine().split(" ");
			int chefPosition = Integer.valueOf(temp[0]);
			int kafePosition = Integer.valueOf(temp[1]);
			int bottle = Integer.valueOf(temp[2]);
			int chefVelocity = Integer.valueOf(temp[3]);
			int kafeVelocity = Integer.valueOf(temp[4]);

			solve (chefPosition,kafePosition,bottle,chefVelocity,kafeVelocity);
		}
		sc.close();
	}

	public static void solve (int ch, int ka, int bo, int vc, int vk){
		int count1 =0, count2 =0;

		for(int i = ch; i <bo; i+=vc){
			count1++;
		}
		for(int j = ka; j >bo; j-=vk){
			count2++;
		}
		if (count1 > count2){
			System.out.println("Kefa");
		}else if (count1 < count2){
			System.out.println("Chef");

		}else if (count1 == count2){
			if (vc > vk){
				System.out.println("Chef");
			}else if (vk > vc){
				System.out.println("Kefa");
			}else{
				System.out.println("Draw");
			}
		}
	}
}
