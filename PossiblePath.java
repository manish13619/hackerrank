import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class PossiblePath {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String s[]=br.readLine().split(" ");
			int a=Integer.parseInt(s[0]);
			int b=Integer.parseInt(s[1]);
			int x=Integer.parseInt(s[2]);
			int y=Integer.parseInt(s[3]);
			if((x-a)%b==0&&(y-b)%a==0){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}
