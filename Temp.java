import java.util.Scanner;

public class Temp {
    
    public static void main(String[] args) {
        
        Scanner banana = new Scanner(System.in);

        System.out.println("Digite a temp em celsius: ");
        float temp_celsius = banana.nextFloat();

        System.out.println(temp_celsius);

        float temp_f = (temp_celsius * 1.8f ) + 32;

        System.out.println(temp_f);
        
        banana.close();
    }
}