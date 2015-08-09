package edu.interview.test;

public class ClassB extends ClassA {
	static{
		System.out.println("D");
	}
	
    public ClassB(String s) {
    	super(s);
		System.out.println("B");
		
	}
    
    public void ClassB(String s ){
    	System.out.println("Infunction");
    }
	public  void methodOne(int i) {
    }
    public void methodTwo(int i) throws  NullPointerException {
    }
    public  static void  methodThree(int i) {
    }
    public static void methodFour(int i) {
    }
}