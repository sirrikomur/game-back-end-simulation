package abstracts.base;

import abstracts.IUserService;
import entities.base.User;

public abstract class UserManager implements IUserService {
    @Override
    public void create(User user) {
        System.out.println("Created " + user.getFirstName() + user.getLastName());
    }

    @Override
    public void update(User user) {
        System.out.println("Updated " + user.getFirstName() + user.getLastName());
    }

    @Override
    public void delete(User user) {
        System.out.println("User was deleted.");

    }
}
