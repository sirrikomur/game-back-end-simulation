package concretes;

import abstracts.IUserCheckService;
import entities.base.User;

public class UserCheckManager implements IUserCheckService {
    @Override
    public boolean checkIfRealPerson(User user) {
        return false;
    }
}
