package tp1;

import java.util.Scanner;

public class ej6 {
        public static void main(String[] args) {
    int num, suma_acumulada = 0, producto_acumulado = 1, i;
    try (Scanner entrada = new Scanner(System.in)) {
        for (i=1; i<4; i++) {
            System.out.println("ingrese un numero");
            num = entrada.nextInt();
            suma_acumulada = suma_acumulada + num;
            producto_acumulado = producto_acumulado * num;
        }
    }
    System.out.println("la suma es: " + suma_acumulada);
    System.out.println("el producto es: " + producto_acumulado);
    }
}
