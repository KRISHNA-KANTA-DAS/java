import java.util.Scanner;

public class ReplaceThirdCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();
        
        StringBuilder modifiedString = new StringBuilder(input);
        
        for (int i = 2; i < modifiedString.length(); i += 3)
         {
            
            modifiedString.setCharAt(i, '*');
        }
        
        System.out.println("Modified string: " + modifiedString.toString());
    }
}
