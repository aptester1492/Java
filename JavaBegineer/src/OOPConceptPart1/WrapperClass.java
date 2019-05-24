package OOPConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {

//string to int
		String s = "100";
		System.out.println(s + 20);
		System.out.println(("***********"));
		int i = Integer.parseInt(s);
		System.out.println(i + 20);

		String s2 = "22.22";
		double d = Double.parseDouble(s2);
		System.out.println(d);

		String s1 = "true";
		Boolean b = Boolean.parseBoolean(s1);
		System.out.println(b);

//int to string 		
		int k = 20;
		String l = String.valueOf(k);

		System.out.println(l + 900);

		String g = "100A"; // NumberformatException
		int a = Integer.parseInt(g);
		System.out.println(a);
	}

}
