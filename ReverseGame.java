import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class ReverseGame {
   
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
    
			String s[]=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            int x=n-1;
            int y=0;
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                if(i%2==0){
                    a[i]=x;
                    if(a[i]==k){
                        System.out.println(i);break;
                    }
                    x--;
                }else{
                    a[i]=y;
                    y++;
                    if(a[i]==k){
                        System.out.println(i);break;
                    }
                }
            }
           //for(int i=0;i<n;i++)System.out.print(a[i]+" ");
	   }
    }

}
