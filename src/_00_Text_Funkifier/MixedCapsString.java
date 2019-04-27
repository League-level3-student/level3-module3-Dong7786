package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String r = "";
		for(int i = 0; i < s.length(); i ++) {
			if(i % 2 == 0 && (int)s.charAt(i) < 91 && (int)s.charAt(i) > 64 || i % 2 == 0 && (int)s.charAt(i) > 96 && (int)s.charAt(i) < 123 || i % 2 == 0 && (int)s.charAt(i) == 32 ) {
				r = r + s.substring(i, i+1).toLowerCase();
			}
				if(i % 2 == 1 && (int)s.charAt(i) < 91 && (int)s.charAt(i) > 64 || i % 2 == 1 && (int)s.charAt(i) > 96 && (int)s.charAt(i) < 123 || i % 2 == 1 && (int)s.charAt(i) == 32 ) {
					r = r + s.substring(i, i + 1).toUpperCase();
				}
		}
		System.out.println(r);
		return r;
	}

}
