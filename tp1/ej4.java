package tp1;

public class ej4 {
        public static void main(String[] args) {
        int num1 = 1, num2 = 2, num3 = 3;
        if (num1 > num2 && num1 > num3){
            System.out.println("el numero mayor es" + num1);
            if (num2 > num1 && num2 > num3) {
                    System.out.println("el numero mayor es" + num2);
                }
                else{
                    System.out.println("el numero mayor es" + num3);
                }
            }

        }
}
