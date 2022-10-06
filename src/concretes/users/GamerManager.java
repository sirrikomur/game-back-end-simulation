package concretes.users;

import abstracts.base.IUserCheckService;
import abstracts.base.UserManager;
import entities.base.User;

public class GamerManager extends UserManager {

    private IUserCheckService _userCheckService;

    public GamerManager(IUserCheckService userCheckService) {
        _userCheckService = userCheckService;
    }

    @Override
    public void create(User user) {
        if (_userCheckService.checkIfRealPerson(user)) {
            super.create(user);
        } else {
            System.out.println("The person could not be verified. Enter your information correctly!");
        }
    }
}
