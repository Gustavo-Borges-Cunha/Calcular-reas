import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a base do Triângulo");
        int base;
        base = entrada.nextInt();
        System.out.println("Insira a altura do Triângulo");
        int altura;
        altura = entrada.nextInt();
        System.out.println("Área do Triângulo = " + (base * altura)/2.0);
    }
}