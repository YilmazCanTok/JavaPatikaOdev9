
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        System.out.print("Please enter the first number : ");
        int number1 = scanner.nextInt();
        System.out.print("Please enter the second number : ");
        int number2 = scanner.nextInt();
        int i = 1;
        int ebob = 1;
        int ekok;
        
        while (i<=number1 && i<=number2) {            
            if (number1%i == 0 && number2%i == 0) {
                ebob = i;
            }
            else{
            }
            i++;
        }
        System.out.println("The biggest number that can devide both of these numbers is : "+ebob);
        ekok = (number1*number2)/ebob;
        System.out.println("The least common multiple of these two numbers is : "+ekok);
        System.out.println("****************************************************");
    }
}
