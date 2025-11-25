import java.util.Scanner;

public class passwordSimulationVer2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String correctPassword = "almira";
    String inputPassword;
    int a = 0;
    do {
        System.out.print("Enter Password : ");
        inputPassword = scanner.nextLine();
        if(inputPassword.equals(correctPassword)){
            System.out.println("Login Successful");
            break;
        }else{
            System.out.println("Wrong Password");
        }
        a++;
    }while(a<3);
        if(a==3){
        System.out.println("Account Locked");
        }
    scanner.close();
    }
}