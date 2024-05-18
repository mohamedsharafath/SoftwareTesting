import java.util.Scanner;

public class CheckPin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempt = 0; 
        int pin = 1234; 
        int limit = 3; 
        
        while (true) {
            System.out.println("Please enter your PIN: ");
            int userPin = scanner.nextInt();
            
            if (userPin == pin) {
                System.out.println("Login successful!");
                return; 
            } 
            else {
                attempt++; 
                if (attempt < limit) {
                    System.out.println("Wrong PIN, try again. Still " + (limit - attempt) + " attempts left.");
                } 
                else {
                    System.out.println("Limit reached.");
                    return;
                }
            }
        }
        
        
    }
}
