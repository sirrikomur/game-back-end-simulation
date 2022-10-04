package concretes;

import abstracts.IUserCheckService;
import abstracts.base.UserManager;
import entities.base.User;

public class GamerManager extends UserManager {

    private IUserCheckService _userCheckService;

    public GamerManager(IUserCheckService userCheckService) {
        _userCheckService = userCheckService;
    }

    @Override
    public void create(User user) {
        try {
            if (_userCheckService.checkIfRealPerson(user)) {
                super.create(user);
            }
        } catch (Exception exception) {
            System.out.println("The person could not be verified.");
        }
    }
}
