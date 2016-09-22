import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;


public class SummingSeries{

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		
        while(t-->0){
			long n=Long.parseLong(br.readLine());
			BigInteger b;
			BigInteger m=new BigInteger("1000000007");
			b=BigInteger.valueOf(n);
			BigInteger res=b;
			res=res.multiply(b);
			res=res.mod(m);
			
            
			System.out.println(res);
		}
		}

	}
	


