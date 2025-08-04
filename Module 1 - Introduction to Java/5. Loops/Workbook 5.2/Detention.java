import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        int numberOfLines = scan.nextInt();
        
        for(int i = 0; i < numberOfLines; i++) {
            System.out.println("I will not forget semi-colons.");
        }
    }
}
