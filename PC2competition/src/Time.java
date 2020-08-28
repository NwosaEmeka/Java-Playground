import java.io.*;
import java.util.Scanner;
public class Time {

	public static void main(String[] args)throws IOException {
		File file = new File("time.txt");
		
		Scanner sc = new Scanner(file);
		
		int num = Integer.valueOf(sc.nextLine());
		
		for(int i =0; i < num; i++){
			String s = sc.nextLine();
			String[]temp = s.split(":");
			char c = s.charAt(s.length()-2);
			int h = Integer.valueOf(temp[0]);
			int m = Integer.valueOf(temp[1]);
			int ss = Integer.valueOf(temp[2].substring(0,2));
			
			if(c == 'P' && h <12){
				h = h+12;
			}else if (c== 'A' && h == 12){
				h = 0;
			}
			System.out.printf("Case: %01d %02d:%02d:%02d\n", (i+1),h,m,ss);
		}
	}

}
