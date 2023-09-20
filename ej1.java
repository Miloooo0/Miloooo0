import java.util.Scanner;
public class ej1{
    public static void  main(String[] args){
        System.out.println("Este programa calcula el área de un triángulo.");
        Scanner teclado = new Scanner(System.in);
        double base, altura;
        System.out.println("Escribe el valor de la base del triángulo: ");
        base = teclado.nextDouble();
        System.out.println("Escribe el valor de la altura del triángulo: ");
        altura = teclado.nextDouble();
        System.out.println("El área del triángulo es igual a: " + (base*altura)/2);
        teclado.close();
    }
}