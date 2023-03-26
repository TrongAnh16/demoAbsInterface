import abs.Animal;
import inter.Swimable;

public class Nemo extends Animal implements Swimable {

    public Nemo(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println(name + " bơi như cá");
    }
}
