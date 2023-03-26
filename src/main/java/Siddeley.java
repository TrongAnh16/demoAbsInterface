import abs.Machine;
import inter.Flyable;

public class Siddeley extends Machine implements Flyable {

    public Siddeley(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(name + " bay như phản lực");
    }
}
