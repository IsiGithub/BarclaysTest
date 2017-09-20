package barclaysTestProject;

public final class  NaturalNumber {
	
	
	public NaturalNumber() {
		
	}
	

	
	
	public  String modulox(Integer value) {
		
		String rep = value.toString();
		if ( 0<= value) {
			
			
			int d3 = 0,d5 = 0;
			
	
			if(diviblePar3(value)) {
				 rep = "fizz";
				 d3 = 1;
			}
			if(diviblePar5(value)) {
				
				 rep = "buzz";
				 d5 = 1;
				
			}
			if(d3 == 1 && d5 == 1) {
				
				rep = "fizzbuzz";
			}
		}
		
		return rep;
		
		
	}
	
	/**
	 * Methode permettant de savoir si le nombre est divisible par 3
	 * On divise donc le nombre par 10 pour réduire la taille du nombre et on utilise le modulo pour
	 *  les récuperer un par un 
	 *  puis pour savoir si il est divisible on regarde 
	 *  si le nombre apres la virgule est supérieur a 0
	 * @return
	 */
	public boolean diviblePar3(Integer value) {
		
		int sumModulo = 0;
		int calcValue = value;
		int moduloValue = value;
		boolean rep = false;
		Integer test = 0;
		Double sumMo;
		String result;
		String t[];
		
		while(calcValue != 0) {
					
			calcValue/= 10; 
			moduloValue%= 10;
			sumModulo += moduloValue;
			moduloValue = calcValue;
				
		}
		
		sumMo = (double) sumModulo;
		result = Double.toString(sumMo/ (double) 3);
		System.out.println("t "+ result);
		t = result.split("\\.");
		if(t[1].compareTo("0") == 0) {
			
			rep = true;
		}
		
		return rep ;
	}
	/**
	 * Methode permettant de savoir si le nombre est divisible par 5
	 * On vérifie que le dernier chiffre du nombre est 0 ou 5
	 * @return
	 */
	public boolean diviblePar5(Integer value) {
		
		boolean rep = false;
		String sValue = Integer.toString(value);
		
		 if (sValue.endsWith("0") || sValue.endsWith("5")) {
			 
			 rep = true;
		 }
		return rep;
		
	}
	

	
	
	
	

}
