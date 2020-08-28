import java.io.*;
public class Speed {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader (new FileReader ("speed.txt"));
		
		String line = br.readLine();
		int d, s1, s2,time;
		double diff;
		while (! "0 0 0".equals(line)){
			String[] temp = line.split(" ");
			
			 d = Integer.parseInt(temp[0]);
			 s1 = Integer.parseInt(temp[1]);
			 s2 = Integer.parseInt(temp[2]);
			 
			 double time1 = d/(double)s1;
			 double time2 = d/(double)s2;
			 
			 if(time1 > time2){
				 diff = (time1 -time2)*3600;
				 time = (int)Math.round(diff);
			 }else{
				 diff = (time1 -time2)*3600;
				 time = (int)Math.round(diff);
			 }
			 
			 int sec = time %60;
			 int min = (time%3600)/60;
			 int hour = (time%86400)/3600;
			 int day = time /86400;
			
			 System.out.printf("%01d:%02d:%02d:%02d\n",day,hour,min,sec);
			line = br.readLine();
		}
	br.close();	
	}

}
