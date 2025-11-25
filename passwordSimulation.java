import java.util.Scanner;

public class passwordSimulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctPassword = "almira";
        int p;
        for (p=0;p<3;p++){
            System.out.print("Enter password : ");
            String input = sc.nextLine();
            if (input.equals(correctPassword)){
            System.out.println("Login Successful");
            break; 
            }else{
                System.out.println("Wrong Password");
            }
        }
            if (p==3){
                System.out.println("Account Locked");
        }
      sc.close(); 
    }
}
