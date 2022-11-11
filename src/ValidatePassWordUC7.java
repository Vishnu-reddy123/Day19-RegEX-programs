import java.util.Scanner;

public class ValidatePassWordUC7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Password:");
        String PassWord = scan.next();
        String regex = "[A-Z][a-z]{5,}[0-9]{1,}";
        boolean result = PassWord.matches(regex);
        if(result) {
            System.out.println("Given Password is valid");
        }
        else
        {
            System.out.println("Given Password is not valid");
        }
    }
}
