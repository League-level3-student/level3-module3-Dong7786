package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String n = "";
		for(int i = s.length() - 1; i >= 0 ; i --) {
			n = n + s.substring(i , i + 1);
			
//			System.out.println(i + ", "+ (i + 1) + ", " + (s.length() - i) + ", " + (s.length() - i - 1)) ;
//			System.out.println(s.substring(i, i+1) + ", " + s.substring(s.length() - i - 1,s.length() - i ));
//			String swap = s.substring(i, i+1);
//			s = s.replace(s.substring(i, i+1), s.substring(s.length() - i - 1,s.length() - i )  );
//			s = s.replace(s.substring(s.length() - i - 1,s.length() - i ) , swap);
		}
		
		return n;
	}

}

