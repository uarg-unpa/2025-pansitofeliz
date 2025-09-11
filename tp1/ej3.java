package tp1;
public class ej3 {
    public static void main (String[] args){
    int a = 1, b = 2, c = 3;
    int aux;
    System.out.println("valores iniciales: ");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);

    aux = c;
    b = a;
    c = a;
    a = aux;

    System.out.println("valores finales: ");
    System.out.println("a = " + a);
    System.out.println("b = " + b);
    System.out.println("c = " + c);
}
}