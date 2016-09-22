import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Fractions {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[n];
		int b[]=new int[n];
		String s[]=br.readLine().split(" ");
		int small=Integer.MAX_VALUE;
		int sum=0;
		for(int i=0;i<n;i++){
			a[i]=Integer.parseInt(s[i]);
			sum+=a[i];
			if(small>a[i])small=a[i];
		}  
		if(small==1)System.out.println(sum);
		else{
				int floor=1;
				int summ=Integer.MAX_VALUE;
				while(floor++<small){
					sum=0;
					for(int i=0;i<n;i++){
							b[i]=a[i]/floor;
		
							//System.out.print(b[i]+" ");
					}
					for(int i=0;i<n;i++){
							int div=a[i]/b[i];
							while((b[i]>1)&&(div==floor)){
								b[i]--;
								div=a[i]/b[i];
							}
							b[i]++;
							sum+=b[i];
							//System.out.print(b[i]+" ");
					}
					if(summ>sum)summ=sum;
				}
				System.out.println(summ);
		}
	}

}
