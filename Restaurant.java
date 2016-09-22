import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Restaurant {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			String s[]=br.readLine().split(" ");
			int x=Integer.parseInt(s[0]);
			int y=Integer.parseInt(s[1]);
			int z=(x<y)?x:y;
			int cnt[]=new int[z+1];
			for(int i=1;i<=z;i++){
				if((x%i==0)&&(y%i==0))cnt[i]=(x*y)/(i*i);
				
			}
			for(int i=z;i>=1;i--){
				if(cnt[i]!=0){
					System.out.println(cnt[i]);
					break;
				}
			}
		}
	}

}
