package controllers.login;

public class LoginController {
    public boolean checkUserNameaandPassword(String userName, String password) {
        if (userName.equals("Tharaka") &&  password.equals("123") ) {
            return true;
        }
        return false;
    }
}
