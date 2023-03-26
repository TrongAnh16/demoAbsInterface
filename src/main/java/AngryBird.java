import abs.Animal;
import inter.Flyable;

public class AngryBird extends Animal implements Flyable {

    public AngryBird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " bay như chim");
    }
}
