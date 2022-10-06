package abstracts.base;

import entities.base.User;

public interface IUserCheckService {
    boolean checkIfRealPerson(User user);
}
