package tp1;
public class ej2 { 
    public static void main(String[] args) {
        int valor1 = 5, valor2 = 3, resultadoentero;
        double decimal1 = 7.5, decimal2 = 2.0, resultadodecimal;
    
    
        resultadoentero = valor1 / valor2;
        System.out.println("resultado (valor1 / valor2) = " + resultadoentero);
        resultadoentero = (int) (valor1 / decimal2) / (int) (decimal1 / valor1);
        System.out.println("resultado (int) (valor1 / decimal2) / (int) (decimal1 / valor1) = " + resultadoentero);
        resultadodecimal = (double) valor1 / valor2;
        System.out.println("resultado (double) valor1 / valor2 = " + resultadodecimal);
        resultadodecimal = (double) valor1 * decimal2 / (int) decimal1;
        System.out.println("resultado (double) valor1 * decimal2 / (int) decimal1 = " + resultadodecimal);
        resultadodecimal = (double) (valor1 * decimal2);
        System.out.println("resultado (double) (valor1 * decimal2) = " + resultadodecimal);
        resultadodecimal = (double) (valor1 * decimal2) / (decimal1 * (int) decimal2);
        System.out.println("resultado (double) (valor1 * decimal2) / (decimal1 (int) decimal2)" + resultadodecimal);
        resultadodecimal = valor1 * (int) decimal2;
        System.out.println("resultado valor1 * (int) decimal2 = " + resultadodecimal);
        resultadodecimal = (int) (valor1 * (int) decimal2);
        System.out.println("resultado (int) (valor1 * (int) decimal2) = " + resultadodecimal);
        
    }
}