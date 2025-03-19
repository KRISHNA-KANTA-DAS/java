import java.util.*;
public class decimaltobinary {
    public static void main(String[] args){
    System.out.println("Enter the decimal number");
    Scanner sc= new Scanner(System.in);
    int a;
    a=sc.nextInt();
     StringBuilder sc1=new StringBuilder();
    while(a>0){
     
     sc1.append(a%2);
     a=a/2;

    }
    System.out.println(sc1.reverse().toString());

    }
}
