package App.UserView;

import App.Entity.User;
import App.Functional.UserFunctions;

import java.util.Scanner;

public class UserViewFunctional {

    private UserFunctions userFunctions;

    public UserViewFunctional(UserFunctions userFunctions) {
        this.userFunctions = userFunctions;
    }

    public void executeFunctionality() {
        Scanner scanner = new Scanner(System.in);
        userFunctions.addUser(new User("Martin", "hzdkv@example.com"));
        userFunctions.addUser(new User("John", "aasddasd@gmail.com"));
        userFunctions.addUser(new User("Mary", "1111@gmail.com"));
        userFunctions.addUser(new User("John", "fffasas@gmail.com"));

        System.out.println("List of users:");
        userFunctions.printUsers();

        System.out.println("enter index of user you want to see");
        int index = scanner.nextInt();

        User user = userFunctions.getUser(index - 1);
        if (user != null) {
            System.out.println("User index: " + index + " " + user.getName() + " " + user.getEmail());

        } else {
            System.out.println("User index: " + index + " not found");
        }
        scanner.close();
    }
}
