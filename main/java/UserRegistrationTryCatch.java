import java.util.regex.Pattern;

public class UserRegistrationTryCatch {
    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
    private static final String EMAIL = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    private static final String PHONE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";

    public boolean validateFirstName(String firstName) throws UserRegistrationException {
        try {
            return Pattern.matches(FIRST_NAME, firstName);
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }
    public boolean validateLastName(String lastName)  throws UserRegistrationException {
        try {
            return Pattern.matches(LAST_NAME, lastName);
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }

    public boolean validatePassWord(String passWord)  throws UserRegistrationException {
        try {
            return Pattern.matches(PASSWORD, passWord);
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }

    public boolean validateEmail(String email)  throws UserRegistrationException {
        try {
            return Pattern.matches(EMAIL, email);
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }

    public boolean validatePhoneNum(String phoneNum)  throws UserRegistrationException {
        try {
            return Pattern.matches(PHONE_NUMBER, phoneNum);
        } catch (Exception e) {
            throw new UserRegistrationException("Invalid Entry!");
        }
    }

}