import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class FindPoint {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String s[]=br.readLine().split(" ");
			int px=Integer.parseInt(s[0]);
			int py=Integer.parseInt(s[1]);
			int qx=Integer.parseInt(s[2]);
			int qy=Integer.parseInt(s[3]);
			int resx=2*qx-px;
			int resy=2*qy-py;
			System.out.println(resx+" "+resy);
		}
	}

}
