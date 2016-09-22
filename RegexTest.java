import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexTest {

	
	public static void main(String[] args) {
		String s="9009";
		Pattern p=Pattern.compile("[9][09]*");
		Matcher m=p.matcher(s);
		if(m.find()&&(m.group().equals(s))){
			System.out.println(s);
		}
	}

}
