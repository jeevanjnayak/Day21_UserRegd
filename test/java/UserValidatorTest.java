import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {

    @Test
    public void GivenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Jeevan");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenFirstName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("jeevan");
        Assert.assertFalse(result);
    }
    @Test
    public void GivenFirstName_WhenSpecialChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Jeev@n");
        Assert.assertFalse(result);
    }
    @Test
    public void GivenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Nayak");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Na");
        Assert.assertFalse(result);
    }
    @Test
    public void GivenLastName_WhenSpecialChar_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("N@y@k");
        Assert.assertFalse(result);
    }
    @Test
    public void GivenPassWord_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassWord("Jeevan_123");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenPassWord_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePassWord("Jeevan123");
        Assert.assertFalse(result);
    }
    @Test
    public void GivenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("jeevanjyoti.nayak@bridgelabz.com");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenEmail_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("jeevanjyoti.nayak@.com");
        Assert.assertFalse(result);
    }
    @Test
    public void GivenPhoneNum_WhenProper_ShouldReturnTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNum("91 1234567890");
        Assert.assertTrue(result);
    }
    @Test
    public void GivenPhoneNum_WhenNotProper_ShouldReturnFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validatePhoneNum("79 1234567890");
        Assert.assertFalse(result);
    }
}