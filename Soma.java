import java.util.Scanner;

public class Soma {

   public static void main(String[] args) {
      Scanner banana = new Scanner(System.in);

      int n1, n2, total;

      System.out.println("Informe o primeiro valor: ");
      n1 = banana.nextInt();

      System.out.println("Informe o segundo valor: ");
      n2 = banana.nextInt();

      total = n1 + n2;

      System.out.println("O valor da soma das variáveis é: " + total);

   }
   
}