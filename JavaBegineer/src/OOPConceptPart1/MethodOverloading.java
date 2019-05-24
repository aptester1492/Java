package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {

		MethodOverloading obj=new MethodOverloading();
		obj.sum();
		obj.sum(20);
		obj.sum(20, 30);
		
		
	}

	public void sum() {										//zero i/p para
		System.out.println("sum method zero parameter");
	}

	public void sum(int i) {								//one i/p para
		System.out.println("one parameter");
		System.out.println(i);
	}

	public void sum(int j, int k) {                          //two i/p para
		System.out.println("two parameter");
		System.out.println(j);
		System.out.println(k);
		System.out.println();
	}
}
