package OOPConceptPart1;

public class LocalVsGlobalVariables {

								
				// global variable
	String name = "arun";
	static int age = 27;

	public static void main(String[] args) {
		int p = 25; // local variable
		LocalVsGlobalVariables obj = new LocalVsGlobalVariables();
		System.out.println(obj.name);
		System.out.println(LocalVsGlobalVariables.age);
	}

	public void sum() {
		int i = 20; // local variables
		int j = 24;

	}

}
