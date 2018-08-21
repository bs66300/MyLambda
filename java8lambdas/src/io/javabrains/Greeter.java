package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting) {
		//System.out.println("hello!!");
		greeting.perform();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Greeter greeter = new Greeter();
    HelloWorldGreeting  helloworldgreeting = new HelloWorldGreeting();
    //helloworldgreeting.perform();
    greeter.greet(helloworldgreeting);
    MyLambda greetingFn = () -> System.out.println("Hello");
    
    greetingFn.testFoo();
    
    
    greeter.greet(()-> System.out.println("hello Lambda!"));
    
    //doubleLambdaFn =  (int a) ->  2*a;
  
    //addlambdafn = (int a, int b) -> a+b ;
   /* safeDivideFn  = (int a ,int b) -> {
    	if(b == 0) return 0;
    	return a/b;
    };*/
    
    
   // stringLenCount = (String s) -> s.length();
    
   MyAdd  addFunction = (int x,int y) -> x +  y;
    
	}

}

interface MyLambda {
	public  void testFoo();
}

interface  MyAdd {
	int  add(int x, int y);
}
