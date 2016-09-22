import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Divisors {
	public static HashMap<Integer,Integer>hm;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int n=Integer.parseInt(br.readLine());
			if(n==1)System.out.println(0);
			else if(n==2)System.out.println(1);
			else if(n==3)System.out.println(0);
			else{
				primeFactors(n);
				if(hm.get(2)==null){
					System.out.println(0);
				}
				else{
					int res=hm.get(2);
					for (Map.Entry<Integer,Integer> entry : hm.entrySet()) {
					    int key = entry.getKey();
					    int value = entry.getValue();
					    if(key!=2){
					    	res=res*(value+1);
					    	
					    }
					}
					System.out.println(res);
				}
		
		}
		}
	}
	public static void primeFactors(int n){
		//number of 2s that divide n
		hm=new HashMap<Integer,Integer>();
		while(n%2==0){
			if(hm.get(2)==null)hm.put(2,1);
			else hm.put(2, hm.get(2)+1);
			n=n/2;
		}
		//n must be odd now
		for(int i=3;i<=Math.sqrt(n);i=i+2){
			//while i divide n accept i and divide n
			while(n%i==0){
				if(hm.get(i)==null)hm.put(i, 1);
				else hm.put(i, hm.get(i)+1);
				n=n/i;
			}
		}
		//this condition is to handle the case when n is a prime number greater than 2
		if(n>2){
			if(hm.get(n)==null)hm.put(n, 1);
		}
	}

}
