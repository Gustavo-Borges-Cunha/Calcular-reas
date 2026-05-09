import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        double pi;
        pi = 3.14;
        System.out.println("Insira o Raio:");
        int raio;
        raio = entrada.nextInt();
        System.out.println("Área do Circulo = "+ (raio*raio)*pi);
    }
}