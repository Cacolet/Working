package �򵥹���֮���ӻ�����;

public class factory {
	public static television getType(String type) {
		television tv=null;
		if(type.equalsIgnoreCase("Haier")) {
			tv=new Haier();
			}
		else if(type.equalsIgnoreCase("Hisense")) {
			tv=new Hisense();
			}
		return tv;
	}

}
