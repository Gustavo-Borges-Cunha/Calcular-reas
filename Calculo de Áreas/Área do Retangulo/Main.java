import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Insira a base do Retângulo");
        int base;
        base = entrada.nextInt();
        System.out.println("Insira a altura do Retângulo");
        int altura;
        altura = entrada.nextInt();
        System.out.println("Área do Retângulo = " + base * altura);
    }
}