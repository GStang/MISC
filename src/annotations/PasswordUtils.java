package annotations;

import java.util.List;

/**
 * Created by DELL on 2017/2/15.
 */
public class PasswordUtils {

    @UesCase(id = 47, description =
            "Password must contain at least on numeric")
    public boolean validatePassword(String password) {
        return (password.matches("\\w*\\d\\w*"));
    }

    @UesCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UesCase(id = 49, description = "" +
            "This is my description")
    public boolean checkForNewPassword(
            List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
