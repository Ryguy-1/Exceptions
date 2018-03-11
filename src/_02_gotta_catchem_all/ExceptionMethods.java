package _02_gotta_catchem_all;

public class ExceptionMethods {
	
	
	public double divide (double x, double y) throws Exception{
		if(y==0) {
			throw new Exception();
		}else {
			return x/y;
		}
		
	}
	public String reverseString(String x) throws IllegalStateException{
		String y = "";
		if(x=="") {
			throw new IllegalStateException();
		}
		for (int i = x.length()-1; i >= 0; i--) {
			y+=x.charAt(i);
		}
		System.out.println(y);
		return y;

	}
}
