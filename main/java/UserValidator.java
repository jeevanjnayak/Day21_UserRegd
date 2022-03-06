import java.util.regex.Pattern;

public class UserValidator {
    private static final String FIRST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String LAST_NAME = "^[A-Z][a-z]{2,}$";
    private static final String PASSWORD = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
    private static final String EMAIL = "^[a-zA-Z0-9_-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
    private static final String PHONE_NUMBER = "^[9][1]{0,1}\\s[0-9]{10}";

    public boolean validateFirstName(String firstName) {
        return Pattern.matches(FIRST_NAME, firstName);
    }

    public boolean validateLastName(String lastName) {
        return Pattern.matches(LAST_NAME, lastName);
    }

    public boolean validatePassWord(String passWord) {
        return Pattern.matches(PASSWORD, passWord);
    }

    public boolean validateEmail(String email) {
        return Pattern.matches(EMAIL, email);
    }

    public boolean validatePhoneNum(String phoneNum) {
        return Pattern.matches(PHONE_NUMBER, phoneNum);
    }

}