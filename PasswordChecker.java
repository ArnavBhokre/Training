import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the password");

        String password = sc.nextLine();

        boolean hasCharacter=false;

        if(password.length()>=8)
        {
            hasCharacter=true;
        }
        boolean hasonedigit=false;
        boolean hasUpperCase=false;
        boolean hasSpecialChar=false;

        for(char ch : password.toCharArray()){
            if(Character.isDigit(ch))
                hasonedigit=true;
            else if(Character.isUpperCase(ch)) hasUpperCase=true;
            else if(!Character.isLetterOrDigit(ch))
                hasSpecialChar=true;

        }

        if(hasCharacter && hasonedigit && hasSpecialChar && hasUpperCase)
        {
            System.out.println("Strong password");
        }
        else{


            System.out.println("weak password");

            if(!hasCharacter){
                System.out.println("Minimun 8 character");
            }
            if(!hasUpperCase){
                System.out.println("Must have 1 Uppercase");
            }
            if(!hasonedigit){
                System.out.println("Atleast 1 digit");
            }
            if(!hasSpecialChar){
                System.out.println("Must have 1 special character");
            }
        }

        System.out.println(password);
    }
}