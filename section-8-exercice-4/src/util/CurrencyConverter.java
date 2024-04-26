package util;

public class CurrencyConverter {
	public static final double DOLAR = 3.10;
	
	public static final double IOF = 0.06;
	
	public static double converter(double real) {
		return (real * DOLAR) + ((real * DOLAR)* IOF) ;
	}
}
