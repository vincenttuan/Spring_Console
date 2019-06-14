package hello.spring.beans;

public class LottoSpring implements ILottoSpring{
    private int count;

    public LottoSpring() {
    }

    public LottoSpring(int count) {
        this.count = count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public void print() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
