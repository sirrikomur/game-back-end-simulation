package entities.base;

import abstracts.IEntity;

import java.util.Date;

public class User implements IEntity {
    private int _id;
    private String _identityNumber;
    private String _firstName;
    private String _lastName;
    private Date _dateOfBirth;
    private String _email;

    public int getId() {
        return _id;
    }

    public void setId(int id) {
        _id = id;
    }

    public String getIdentityNumber() {
        return _identityNumber;
    }

    public void set_identityNumber(String identityNumber) {
        _identityNumber = identityNumber;
    }

    public String getFirstName() {
        return _firstName;
    }

    public void setFirstName(String firstName) {
        _firstName = firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public void setLastName(String lastName) {
        _lastName = lastName;
    }

    public Date getDateOfBirth() {
        return _dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        _dateOfBirth = dateOfBirth;
    }

    public String getEmail() {
        return _email;
    }

    public void setEmail(String email) {
        _email = email;
    }
}
