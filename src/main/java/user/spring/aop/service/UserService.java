package user.spring.aop.service;

public class UserService implements IUserService {

    @Override
    public void save() {
        System.out.println("新增");
    }

    @Override
    public void update(String name) {
        System.out.println("修改:" + name);
    }

    @Override
    public void delete() {
        System.out.println("刪除");
    }

    @Override
    public void select() {
        System.out.println("查詢");
    }
    
}
