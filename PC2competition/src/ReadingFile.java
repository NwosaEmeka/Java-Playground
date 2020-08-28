import java.io.*;
public class ReadingFile {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader (new FileReader("example.txt"));
		int test = Integer.parseInt(br.readLine());
		String[]s = new String[test];
		for (int i =0; i < test; i++){
			s[i] = br.readLine();
		}
		int middle = test/2;
		
		if (test % 2 !=0){
			middle = middle+1;
			int i, j;
			for (i = 0,j= middle; i<middle-1;i++,j++ ){
				System.out.println(s[i]);
				System.out.println(s[j]);
			}
			System.out.println (s[middle-1]);
		}else{
			int i, j;
			for(i = 0, j = middle; i <middle; i++,j++){
				System.out.println(s[i]);
				System.out.println(s[j]);
			}
		}
		br.close();
		}

	}


