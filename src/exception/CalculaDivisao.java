package exception;

public class CalculaDivisao {
	
	public double divisao(int num, int den) throws ArithmeticException, CasaDecimalException{
		
		if(den == 0){
			throw new ArithmeticException("Erro no denominador");
		}
		
		if(num % den != 0){
			throw new CasaDecimalException("Números não Multiplos");
		}
		
		return num / den;
	}

}
