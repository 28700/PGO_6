import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

interface Moveable{
    abstract void  start();
    abstract void  stop();


}

abstract class Animal{
    String name;

    Animal(String n){
        name = n;
    }

    abstract String getType();
    String getName(){
        return name;
    }
}
class Cat extends Animal implements Moveable{

    Cat(String s){
        super(s);
    }

    @Override
    public void start() {
        System.out.println("Cat starts!");
    }

    @Override
    public void stop() {
        System.out.println("Cat stopped!");
    }

    @Override
    String getType() {
        return "Cat";
    }
}


public class Main {
    public static void main(String[] args) { Cat mruczek = new Cat("Mruczek");
        mruczek.start();
        System.out.println(mruczek.getType());
        mruczek.stop();
    } }