import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;


public class SherlockAndMovingTiles {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df=new DecimalFormat("0.0000000");
		String s[]=br.readLine().split(" ");
		double l=Double.parseDouble(s[0]);
		double s1=Double.parseDouble(s[1]);
		double s2=Double.parseDouble(s[2]);
		double q=Double.parseDouble(br.readLine());
		while(q-->0){
			int a=Integer.parseInt(br.readLine());
			if((s1-s2)!=0.0d){
				
			
			double time=Math.abs((Math.sqrt(2)*l-Math.sqrt(2*a))/(s1-s2));
			System.out.println(df.format(time));
			}
			else {
				System.out.println("0.0000000");
			}
		}
	}

}
