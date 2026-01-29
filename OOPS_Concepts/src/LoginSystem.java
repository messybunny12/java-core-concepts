import java.util.Scanner;

class Login {
    private String userName;
    private String password;

    public Login(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public boolean validateLogin(String inputUser, String inputPass) {
        return userName.equals(inputUser) && password.equals(inputPass);
    }
}

public class LoginSystem {
    public static void main(String[] args) {
        Login login = new Login("User", "password");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String userName = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (login.validateLogin(userName, password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }

        sc.close();
    }
}
