package tdd.tdd;
public class SourceCode {
	String replace(String s)
	{
		if(s==null)
		return null;
		
		if(s.length()<2)
		return s.replace("A","");
		
		String FirstTwoChars=s.substring(0,2);
		FirstTwoChars=FirstTwoChars.replace("A", "");
		s=FirstTwoChars+s.substring(2);
		return s;
		
	}

}
