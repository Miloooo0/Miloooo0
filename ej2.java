import java.util.Scanner;
public class ej2{
    public static void  main(String[] args){
        System.out.println("Este programa calcula si un número es positivo, negativo o cero.");
        Scanner teclado = new Scanner(System.in);
        double numero;
        System.out.println("Escribe el valor: ");
        numero = teclado.nextDouble();
        if(numero > 0){
            System.out.println("El número es positivo");
        }
        else if(numero == 0){
            System.out.println("El número es 0");
        }
        else{
            System.out.println("El número es negativo");
        }
        teclado.close();
    }
}