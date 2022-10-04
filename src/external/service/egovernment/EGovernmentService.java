package external.service.egovernment;

public class EGovernmentService {
    private static IdentityManager _identityManager = new IdentityManager();

    public boolean validatePerson(String identityNumber, String firstName, String lastName, int yearOfBirth) {

        // It is assumed that the "First Name", "Last Name" and "Year Of Birth" is validated in the database.

        return _identityManager.validateIdentityNumber(identityNumber);
    }
}
