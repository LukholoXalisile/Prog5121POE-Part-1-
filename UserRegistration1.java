import java.util.Scanner;

public class Main {
    
    // Validate username
    public static boolean isValidUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }
    
    //Validate passwork
    public static boolean isValidPassword(String password) {
        boolean hasUpper = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        
        if (password.length() < 8) {
            return false;
        }
        
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            }else if (Character.isDigit(ch)) {
                hasNumber = true;
            }else if (!Character.isLetterOrDigit(ch)) {
                hasSpecial = true;
            }
        }
        
        return hasUpper && hasNumber && hasSpecial;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Username input
        System.out.print("Enter username: ");
        String username = input.nextLine();
        
        if (isValidUsername(username)) {
            System.out.println("Username successfully captured."); 
        } else {
            System.out.println("Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.");
        }
        
        // Password input
        System.out.println("Enter password: ");
        String password = input.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.");
        }
        
        input.close();
    }
}