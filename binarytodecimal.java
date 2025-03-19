import java.util.*;
public class binarytodecimal {
    public static void main(String args[]) {
        int a;
        System.out.println("Enter the binary number");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();  
      sc.close();
      int lastnum=0;
      int power=0;
      int decimal=0;
while (a>0){
      lastnum=a%10;
      a=a/10;
      decimal+=lastnum*(int)Math.pow(2,power);
      power++;
}
    System.out.println("The decimal number is"+decimal);
    }
    
    
    
    
    }
