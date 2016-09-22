import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Power {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int m=Integer.parseInt(s[1]);
		int Pstr[]=new int[n+1];
		int Bq[]=new int[m+1];
		String s1[]=br.readLine().split(" ");
		for(int i=1;i<=n;i++)Pstr[i]=Integer.parseInt(s1[i-1]);
		String s2[]=br.readLine().split(" ");
		for(int i=1;i<=m;i++)Bq[i]=Integer.parseInt(s2[i-1]);
		String op[]=new String[n];
		for(int i=0;i<n;i++){
			op[i]=br.readLine();
		}
		int pow[][]=new int[n+1][m+1];
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				if(op[i-1].charAt(j-1)=='N')pow[i][j]=0;
				else {
					pow[i][j]=Pstr[i]*Bq[j];
				}
			}
		}
//		for(int i=1;i<=n;i++){
//			for(int j=1;j<=m;j++){
//				System.out.print(pow[i][j]+" ");
//			}
//			System.out.println();
//		}
		int sum=0;
		for(int j=1;j<=m;j++){
			int small=pow[1][j];
			for(int i=1;i<=n;i++){
				if(small==0)small=pow[i][j];
				if(pow[i][j]==0)continue;
				if(small>pow[i][j])small=pow[i][j];
			}
			sum=sum+small;
		}
		int sum2=0;
		for(int j=1;j<=m;j++){
			int small=pow[1][j];
			for(int i=1;i<=n;i++){
				if(small==0)small=pow[i][j];
				if(pow[i][j]==0)continue;
				if(small<pow[i][j])small=pow[i][j];
			}
			sum2=sum2+small;
		}
		System.out.println(sum+" "+sum2);
		
		
	}
	

}
