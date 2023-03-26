import abs.Animal;
import inter.Barkable;
import inter.Runable;

public class Bolt extends Animal implements Runable, Barkable {

    public Bolt(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(name + " gâu gâu");
    }

    @Override
    public void run() {
        System.out.println(name + " chạy như chó");
    }
}
