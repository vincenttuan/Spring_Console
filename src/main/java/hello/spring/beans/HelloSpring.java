package hello.spring.beans;

public class HelloSpring implements IHelloSpring {

    @Override
    public void print() {
        System.out.println("Hello Spring");
    }
    
}
