package barclaysTestProject;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test si un nombre est divisible par 3
		NaturalNumber test = new NaturalNumber();
		String v = test.modulox(123);
		System.out.println(v);
		
		
		// test si un nombre est divisible par 5
		v = test.modulox(130);
		System.out.println(v);
		
		
		// test si un nombre est divisible par 15
		v = test.modulox(15);
		System.out.println(v);
	}

}
