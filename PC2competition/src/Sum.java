import java.io.*;
public class Sum {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new FileReader ("sum.txt"));
		String line = br.readLine();
		int num = 0, sum =0;
		while(! "0".equals(line)){
			String[] s= line.split("");
			 num = Integer.parseInt(s[0]);
			 
			 for (int i = 1; i<=num; i++){
				 for (int j = i; j>0; j--){
					 sum++;
					 
				 }
			 }
			 System.out.println(sum);
			line = br.readLine();
	}
		br.close();

	}
}
