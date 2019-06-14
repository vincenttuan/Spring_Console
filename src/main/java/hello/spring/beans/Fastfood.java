package hello.spring.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Fastfood implements IFastfood{
    private Set foodSet;
    private List drinkList;
    private Map packageMap;

    public Fastfood(Set foodSet) {
        this.foodSet = foodSet;
    }

    public Fastfood(List drinkList) {
        this.drinkList = drinkList;
    }

    public Fastfood(Map packageMap) {
        this.packageMap = packageMap;
    }
    
    
    @Override
    public void print() {
        System.out.println(foodSet);
        System.out.println(drinkList);
        System.out.println(packageMap);
    }
    
}
