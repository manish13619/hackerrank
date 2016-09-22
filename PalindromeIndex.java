import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeIndex {
	public static void main(String ags[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n=Integer.parseInt(br.readLine());
	
			while(n-->0){
				String s=br.readLine();
				System.out.println(getPalindromeIndex(s));
			}
	
	}

	static int getPalindromeIndex(String s){
		boolean is=true;
		int len=s.length();
		for(int i=0;i<len/2;i++){
			if(s.charAt(i)!=s.charAt(len-i-1)){
				StringBuilder s2=new StringBuilder(s);
				s2=s2.replace(len-i-1, len-i, "");
				//System.out.println(s2);
				String ss2=String.valueOf(s2);
				if(isPalindrome(ss2)){
					return len-i-1;
				}
				
				StringBuilder s1=new StringBuilder(s);
				s1=s1.replace(i, i+1, "");
				//System.out.println(s1);
				String ss1=String.valueOf(s1);
				
				if(isPalindrome(ss1)){
					return i;
				}
				
				
				
				is=false;
			}
		}
		if(is)
			return -1;
		return 0;
	}
	static boolean isPalindrome(String s){
		int len=s.length();
		for(int i=0;i<len/2;i++){
			if(s.charAt(i)!=s.charAt(len-i-1)){
				return false;
			}
		}
		return true;
	}
}
