package _00_Text_Funkifier;

public class newString extends SpecialString{

	public newString(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String funkifyText(String s) {
		// TODO Auto-generated method stub
		String r = "";
		for(int i = 0 ; i < s.length(); i ++ ) {
			r = r + s.substring(i, i + 1).toLowerCase();
			r = r + " ";
		}
		return r;
	}

}
