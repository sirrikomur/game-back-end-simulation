package abstracts;

import entities.base.User;

public interface IUserService {
    void create(User user);
    void update(User user);
    void delete(User user);
}
