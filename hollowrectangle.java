import java.util.*;

public class hollowrectangle {
    public static void main(String[] args) {
        int i, j, row, col;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        row = sc.nextInt();

        System.out.println("Enter number of columns:");
        col = sc.nextInt();

       
        for (i = 1; i <= row; i++) {
           
            for (j = 1; j <= col; j++) {
                
                if (i == 1 || i == row  || j == 1 || j == col ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }

        sc.close();
    }
}
