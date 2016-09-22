import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Prime{
    
    public final InputStream in = System.in;
    void checkPrime(int ...var){
    	
    	for(int i=0;i<var.length;i++){
    		boolean isPrime=true;
    		if(var[i]==1)isPrime=false;
    		for(int j=2;j<=var[i]/2;j++){
    		   if(var[i]%j==0){
    		      isPrime=false;
    		      break;
    		   }
    		}
    		if(isPrime)System.out.print(var[i]+" ");
    	}
    	System.out.println();
    }
}
	

public class CheckPrimeClass {
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		System.out.println(s);
		Prime ob=new Prime();
		ob.checkPrime();
		ob.checkPrime(1,2,3);
		ob.checkPrime(1,2,3,4,5,6,7,8,9);
	}
}
