package OOPConceptPart1;

public class FunctionsInJava {

	
	public static void main(String[] args) {
		FunctionsInJava obj=new FunctionsInJava();
		
		obj.test();
		int l=obj.add();
		System.out.println(l);
		
		String st=obj.qa();
		System.out.println(st);
		
		int div=obj.division(16, 8);
		System.out.println(div);
	}
	
	//non static method or function
	// not return any value
	public void test() {                    //no i/p   no o/p
		System.out.println("test method");
	}
	//return type is int
	public int add() {                     ///no i/p    some o/p
		int a=10;
		int b=20;
		int c=a+b;
		return c;		
		//System.out.println();
	}
	//return type is String
	public String  qa() {               //no i/p  some o/p
		String s="selenium";
		return s;		
	}
	
	//x,y are input parameter or argument
	public int division(int x, int y) {     
		int d=x/y;
		return d;
	}
	
}
