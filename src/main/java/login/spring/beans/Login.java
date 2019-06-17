package login.spring.beans;

public class Login implements ILogin {
    private IUserDAO userDAO;

    public void setUserDAO(IUserDAO userDAO) {
        this.userDAO = userDAO;
    }
    
    @Override
    public boolean check(String username, String password) {
        return userDAO.find(username, password);
    }
    
}
