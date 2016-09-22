//erroraneos
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EvenOdd {

	public static int A[];
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		A=new int[n+1];
		String s[]=br.readLine().split(" ");
		for(int i=0;i<n;i++)A[i+1]=Integer.parseInt(s[i]);
		int q=Integer.parseInt(br.readLine());
		while(q-->0){
			String s1[]=br.readLine().split(" ");
			int x=Integer.parseInt(s1[0]);
			int y=Integer.parseInt(s1[1]);
			if(x>y)System.out.println("Odd");
			else if(A[x]%2==0)System.out.println("Even");
			else System.out.println("Odd");
		}
	}
	public static long find(int x,int y)
	{
	    if(x>y) return 1;
	    long ans = (long) Math.pow(A[x],find(x+1,y));
	    return ans;
	}

}
