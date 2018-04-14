	package vm222cv_assign4.time;

public class Concatenations 
{
	public static void main (String[] args)
	{
		String str = "";
		long start = 0;
		
		// short string with one character using + 
		start = System.currentTimeMillis();
		
		while (System.currentTimeMillis() - start < 1000)
		{
			str = str + "a";
		}
	
		System.out.println("Short string concatenation => Total concatenations in one second: " + str.length() + ", Length of string: " + str.length());
			
		//short string with one character using StringBuilder
		start = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		
		while (System.currentTimeMillis() - start < 1000)
		{
		     sb.append("*");
		}
		
	    str = sb.toString();
	     	
		System.out.println("Short string append => Total concatenations in one second: " + str.length() + ", Length of string: " + str.length());
		
		//long string with 80 characters using +
		start = System.currentTimeMillis();
		
		while (System.currentTimeMillis() - start < 1000)
		{
		     str = str + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
		}
		
		System.out.println("Long string concatenation => Total concatenations in one second: " + str.length()/80 + ", Length of string: " + str.length());
		
		//long string with 80 characters using StringBuilder
		start = System.currentTimeMillis();
				
		StringBuilder st = new StringBuilder();
				
		while (System.currentTimeMillis() - start < 1000)
		{
			st.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		}
		str = st.toString();
			     
		System.out.println("Long string append => Total concatenations in one second: " + str.length()/80 +  ", Length of string: " + str.length());		
	}
}

