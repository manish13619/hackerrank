import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class DiwaliLights {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			long res=1;
			for(int i=1;i<=n;i++){
				res=(res*2)%100000;
			}
			System.out.println(res-1);
		}
		}

	}
	


