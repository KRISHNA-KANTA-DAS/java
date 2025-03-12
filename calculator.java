import java.util.*;
public class calculator {
public static void main(String[] args){
    int a ,b,result;
    System.out.println("ENter the number for calculation");
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();
result=calc(a,b);
System.out.println("your answer " +result);
}



    public static int calc(int a,int b){
        int result=0;
        System.out.println("Enter your choice");
        System.out.println("Press 1 for adding");
        System.out.println("Press 2 for substraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        Scanner sc=new Scanner(System.in);
        int ch=sc.nextInt();
        switch(ch){
            case 1: {
                result =a+b;
                break;
            }
            case 2: {
                result =a-b;
                break;
            }
            case 3: {
                result =a*b;
                break;
            }
            case 4: {
                result =a/b;
                break;
            }
           

        } return result;
         
    }





}