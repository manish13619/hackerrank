import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class PrimeDivisors {
	public static ArrayList<Integer> alist; 
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			primeFactors(n);
			System.out.println(alist);
		}
	
	}
	public static void primeFactors(int n){
		//accept number of 2s that divide n
		alist=new ArrayList<Integer>();
		while(n%2==0){
			alist.add(2);
			n=n/2;
		}
		//n must be odd now
		for(int i=3;i<=Math.sqrt(n);i=i+2){
			//while i divide n accept i and divide n
			while(n%i==0){
				alist.add(i);
				n=n/i;
			}
		}
		//this condition is to handle the case when n is a prime number greater than 2
		if(n>2)alist.add(n);
	}

}
