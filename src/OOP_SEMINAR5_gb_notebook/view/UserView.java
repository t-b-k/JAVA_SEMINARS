package OOP_SEMINAR5_gb_notebook.view;

import OOP_SEMINAR5_gb_notebook.controller.UserController;
import OOP_SEMINAR5_gb_notebook.model.User;
import OOP_SEMINAR5_gb_notebook.util.Commands;

import java.util.Scanner;

public class UserView {
    private final UserController userController;

    public UserView(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com;

        while (true) {
            String command = prompt("Ââåäèòå êîìàíäó: ");
            com = Commands.valueOf(command);
            if (com == Commands.EXIT) return;
            switch (com) {
                case CREATE:
                    String firstName = prompt("Èìÿ: ");
                    String lastName = prompt("Ôàìèëèÿ: ");
                    String phone = prompt("Íîìåð òåëåôîíà: ");
                    userController.saveUser(new User(firstName, lastName, phone));
                    break;
                case READ:
                    String id = prompt("Èäåíòèôèêàòîð ïîëüçîâàòåëÿ: ");
                    try {
                        User user = userController.readUser(Long.parseLong(id));
                        System.out.println(user);
                        System.out.println();
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
            }
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
