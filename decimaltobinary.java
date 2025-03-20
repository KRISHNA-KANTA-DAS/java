import java.util.*;
public class decimaltobinary {
    public static void main(String[] args){
    System.out.println("Enter the decimal number");
    Scanner sc= new Scanner(System.in);
    int a;
    a=sc.nextInt();
    System.out.println("Choose your approach");
    int choice= sc.nextInt();
    switch(choice){
        case 1:
        {
            StringBuilder sc1=new StringBuilder();
            while(a>0){
             
             sc1.append(a%2);
             a=a/2;
        
            }
            System.out.println(sc1.reverse().toString());
        break;
        }
        case 2:
        {
            int power=0,binary=0,remainder=0;

            while(a>0){
               remainder =a%2;
               binary+=remainder*(int)Math.pow(10,power);
               power++;
                 a=a/2;  


              }
              System.out.println(binary);

 break;
        }
    }
     
    }
}
