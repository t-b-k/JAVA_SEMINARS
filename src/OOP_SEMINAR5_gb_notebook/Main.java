package OOP_SEMINAR5_gb_notebook;

import OOP_SEMINAR5_gb_notebook.controller.UserController;
import OOP_SEMINAR5_gb_notebook.dao.impl.FileOperation;
import OOP_SEMINAR5_gb_notebook.model.User;
import OOP_SEMINAR5_gb_notebook.repository.GBRepository;
import OOP_SEMINAR5_gb_notebook.repository.impl.UserRepository;
import OOP_SEMINAR5_gb_notebook.view.UserView;
public class Main {
    public static void main(String[] args) {
        createDB();
        FileOperation fileOperation = new FileOperation(DB_PATH);
        GBRepository<User, Long> repository = new UserRepository(fileOperation);
        UserController controller = new UserController(repository);
        UserView view = new UserView(controller);
        view.run();
    }
}
