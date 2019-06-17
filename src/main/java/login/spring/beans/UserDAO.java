package login.spring.beans;

public class UserDAO implements IUserDAO{

    @Override
    public boolean find(String username, String password) {
        if(username.equals("admin") && password.equals("1234")) {
            return true;
        } else {
            return false;
        }

    }
    
}
