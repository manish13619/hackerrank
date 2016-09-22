import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SpecialMultiple {

	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t-->0){
			int N=Integer.parseInt(br.readLine());
			int i=1;
			while(true){
				int n=N*i;
				String s=String.valueOf(n);
				Pattern p=Pattern.compile("[9][09]*");
				Matcher m=p.matcher(s);
				if(m.find()&&(m.group().equals(s))){
					System.out.println(s);break;
				}
				else i++;
				
			}
		}
	}

}
