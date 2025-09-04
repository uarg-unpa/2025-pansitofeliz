package tp1;
public class ej1 {
    public static void main(String[] args) {
        int valor1 = 5, valor2 = 3, resultadoentero;
        double decimal1 = 2.5, decimal2 = 2.0, resultadodecimal;
        
        resultadoentero = valor1 / valor2;
        System.out.println("resultado (valor1 / valor2) = " + resultadoentero);
        resultadodecimal = valor1 / decimal1;
        System.out.println("resultado (valor1 / decimal1) = " + resultadodecimal);
        resultadodecimal = valor1 * decimal2;
        System.out.println("resultado (valor1 * decimal2) = " + resultadodecimal);
        resultadoentero = valor1 * (int) decimal2;
        System.out.println("resultado (valor1 * (int) decimal2) = " + resultadoentero);
        resultadoentero = (int) (decimal1 * decimal2);
        System.out.println("resultado ((int) decimal1 * decimal2) = " + resultadoentero);
    }
}