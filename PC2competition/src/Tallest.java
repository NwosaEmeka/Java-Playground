import java.io.*;
import java.util.*;
public class Tallest {

	public static void main(String[] args)throws IOException {
		File file = new File ("tallest.txt");
		
		Scanner sc = new Scanner(file);
		
		int num = Integer.valueOf(sc.nextLine());
		
		while(sc.hasNextLine()){
			String[]s = new String[num];
			double[]d = new double[num];
			
			for (int i =0; i < num; i++){
				String[]temp = sc.nextLine().split(" ");
				s[i] = temp[0];
				d[i] = Double.valueOf(temp[1]);
			}
			solve(s,d);
			num = Integer.valueOf(sc.nextLine());
		}
	}
	public static void solve (String[]s, double[]d){
		int index = 0;
		double max = 0.0;
		
		for(int i =0; i < d.length; i++){
			if (d[i] > max){
				max = d[i];
				index = i;
			}
		}
		System.out.println(s[index]);
		
	}

}
