import java.util.Scanner;


public class Atividade3{

    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);

    int a, b;

    System.out.print("Digite o primeiro número: ");
    a = sc.nextInt();

    System.out.print("Digite o segundo núemero: ");
    b = sc.nextInt();

    int soma = a + b;
    

    System.out.println();
    System.out.println("O resultado final é " + soma);

    sc.close();



}
}