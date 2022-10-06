package entities.users;

import entities.base.User;

public class Administrator extends User {
    private int _roleId;

    public int getRoleId() {
        return _roleId;
    }

    public void setRoleId(int roleId) {
        _roleId = roleId;
    }
}
