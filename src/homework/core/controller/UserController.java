package homework.core.controller;

import homework.core.model.User;
import homework.core.model.repository.PersisterUser;
import homework.core.veiw.UserView;

public class UserController {
    private final UserView userView;
    private final PersisterUser persisterUser;

    public UserController(UserView userView, PersisterUser persisterUser) {
        this.userView = userView;
        this.persisterUser = persisterUser;
    }

    public void saveUser(String name) {
        User user = new User(name);
        persisterUser.setUser(user);
        persisterUser.save();
    }

    public void reportUser() {
        persisterUser.report();
    }
}

