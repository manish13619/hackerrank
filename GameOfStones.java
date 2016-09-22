import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameOfStones {
	public static void main(String ...args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int q=Integer.parseInt(br.readLine());
		while(q-->0){
			int n=Integer.parseInt(br.readLine());
			if(isSolvableByA(n)){
				System.out.println("First");
			}else{
				System.out.println("Second");
			}
			
		}
	}
	public static boolean isSolvableByA(int n){
			if(n%7==0 || n%7==1)return false;
			 return true;
	}
	
}
