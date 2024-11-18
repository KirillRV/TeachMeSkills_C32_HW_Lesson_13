import exception.WrongLoginException;
import exception.WrongPasswordException;
import validator.Validator;
import java.util.Scanner;
public class Runner {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Your login: ");
            String login = scanner.nextLine();

            System.out.println("Your password: ");
            String password = scanner.nextLine();

            System.out.println("Your confirmPassword: ");
            String confirmPassword = scanner.nextLine();

            boolean Valid = Validator.validator(login, password, confirmPassword);
            if(Valid) {
                System.out.println("Login and password is true");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Wrong " + e.getMessage());
        }
    }
}
