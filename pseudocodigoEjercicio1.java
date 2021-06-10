import java.util.*;

public class pseudocodigoEjercicio1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int numero;
        int sumaPar = 0;
        int sumaImpar = 0;
        int contador = 0;
        int numeroAleatorio;
        int min = 1;
        int max = 100;

        System.out.println("Ingrese un numero entero:");
        numero = teclado.nextInt();

        for (contador = 0; contador <= numero; contador++) {

            numeroAleatorio = (int)Math.floor(Math.random()*(max-min+1)+min);
            System.out.println(numeroAleatorio);

            if (numeroAleatorio % 2 == 0) {

                sumaPar += 1;

            } else {

                sumaImpar += 1;

            }

        }
        
        System.out.println("Numeros pares generados: "+sumaPar);
        System.out.println("Numeros Impares generados: "+sumaImpar);

    }
}