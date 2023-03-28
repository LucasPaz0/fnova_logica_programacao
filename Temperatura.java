
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double tempC = input.nextDouble();
        
        double tempF = (tempC * 1.8) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + tempF);
    }
}
