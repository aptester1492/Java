package OOPConceptPart1;

public class CallByValue {

	/* it is a call by value concept*/
	int p;
	int q;
	public static void main(String[] args) {
		CallByValue obj=new CallByValue();
		
		int x=3;
		int y=5;
		obj.sum(x,y);
		System.out.println();
		
		obj.p=20;
		obj.q=30;		
		obj.swap(obj);
		
		System.out.println(obj.p);
		System.out.println(obj.q);
		
	}
	
	public int sum(int a,int b) {
		int c=a+b;
		return c;
	}
	public void swap(CallByValue t) {
		
		int temp;
		temp=t.p;
		t.p=t.q;
		t.q=temp;
	}
}
