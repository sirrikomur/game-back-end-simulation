package abstracts;

import entities.base.User;

public interface IUserCheckService {
    boolean checkIfRealPerson(User user);
}
