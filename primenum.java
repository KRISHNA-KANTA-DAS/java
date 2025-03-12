import java.util.*;
public class primenum {
    public static void main(String args[]) {
        int a;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        sc.close(); 

        
        if (a == 2) {
            System.out.println("Prime");
            return;
        }

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break; 
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
