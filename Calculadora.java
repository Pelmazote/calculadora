package main;

/**
 * @author Juan Simón
 *
 */

// 
public class Calculadora {
	
	public Calculadora(){
        
    }
    
    public int suma(int num1,int num2){
        return num1+num2;
    }
    
    public int resta(int num1,int num2){
        return num1-num2;
    }
    
    public int multiplica(int num1,int num2){
        return num1*num2;
    }
    
    public int divide(int num1,int num2){
        if (num2==0) throw new ArithmeticException("NO PUEDES DIVIDIR POR CERO, MELON");
        return num1/num2;
    }
    public int modulo() {
        if (this.numero2 == 0) {
            System.out.println("Error: No se puede calcular el módulo con divisor cero.");
            return 0;
        }
        return this.numero1 % this.numero2;
    }
    public boolean esPrimo(int n) {
    	if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

	private int valor1;
	private int valor2;
}
