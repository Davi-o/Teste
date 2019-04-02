package Model;

public class Calculadora{
 
        // atributo
        private double resultado = 0;
 
        // m�todo somar
        public double somar( int n1, int n2 ){
 
            resultado = n1 + n2;
            return resultado;
        }
 
        // m�todo subtrair
        public double subtrair( int n1, int n2 ){
 
            resultado = n1 - n2;
            return resultado;
        }        
 
        // m�todo multiplicar
        public double multiplicar( double n1, double n2 ){
 
            resultado = n1 * n2;
            return resultado;
        }
 
        // m�todo dividir
        public double dividir( int n1, int n2 ){
 
            resultado = n1 / n2;
            return resultado;
        }
}
