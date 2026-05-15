import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int P, a, l;
        System.out.println("Insira o lado da pirâmide");
        l = entrada.nextInt();
        P = l+l+l+l;
        System.out.println("Insira o ápotema da pirâmide");
        a = entrada.nextInt();
        double area =  (l*l) + (P *a /2.0);
        System.out.println("Área da Pirâmide = " + area);
        entrada.close();
       }
}      
    
