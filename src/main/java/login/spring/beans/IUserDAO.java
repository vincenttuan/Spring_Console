package login.spring.beans;

public interface IUserDAO {
    boolean find(String username, String password);
}

