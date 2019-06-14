package hello.spring.beans;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class LottoSpring implements ILottoSpring{
    private int count;

    public LottoSpring() {
    }

    public LottoSpring(int count) {
        this.count = count;
    }
    
    public LottoSpring(int a, int b) {
        this.count = (int)Math.pow(a, b);
    }
    
    public void init() {
        this.count = 3;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    @Override
    public void print() {
        // 取出 count 個不重複數字, 利用 Set
        Set<Integer> nums = new LinkedHashSet<>();
        while (nums.size() < count) {            
            nums.add(new Random().nextInt(100));
        }
        System.out.println(nums);
    }
    
}
