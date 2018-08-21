package io.javabrains;

public class TypeInferenceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//StringLengthLambda myLambda = s -> s.length();
		//System.out.println(myLambda.getLength("Hello Lambda"));
		printLambda(s -> s.length());

	}
	
	public static void printLambda(StringLengthLambda l) {
		System.out.println(l.getLength("hello Lambda"));
	}
	
	interface StringLengthLambda {
		
		int getLength(String s);
	}

}
