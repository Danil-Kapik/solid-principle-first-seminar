package homework.core.veiw;
import homework.core.controller.UserController;
import java.util.Scanner;

public class UserView {
    private final Scanner scanner;
    private final UserController userController;
    private UserView(UserController userController) {
        this.userController = userController;
        this.scanner = new Scanner(System.in);

    }

    public void promptUserForName() {
        System.out.println("Введите имя пользователя:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        userController.saveUser(name);
    }

    public static void run() {

    }
}
