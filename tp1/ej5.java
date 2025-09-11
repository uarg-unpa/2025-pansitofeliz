package tp1;

import java.util.Scanner;

public class ej5 {
        public static void main(String[] args) {
        String dia;
        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("ingresa una letra de un dia de la semana, sabiendo que las letras son: L para lunes, M para martes, I para miercoles, J para jueves, V para viernes, S para sabado y D para domingo:");
            dia = entrada.nextLine();
            

            switch (dia){
                case "L" -> {
                    System.out.println("Lunes, no tengo Resolucion");
                }
                case "M" ->  {
                    System.out.println("Martes, tengo Resolucion");
                }
                case "I" -> {
                    System.out.println("Miercoles, no tengo Resolucion");
                }
                case "J" ->  {
                    System.out.println("Jueves, tengo Resolucion");
                }
                case "V" -> {
                    System.out.println("Viernes, no tengo Resolucion");
                }
                case "S" ->  {
                    System.out.println("Sabado, tengo Resolucion");
                }
                case "D" ->  {
                    System.out.println("Domingo, tengo Resolucion");
                }
    }
    }
}
}
