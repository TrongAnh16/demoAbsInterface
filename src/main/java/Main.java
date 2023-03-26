import abs.Animal;
import inter.Barkable;
import inter.Flyable;
import inter.Runable;
import inter.Swimable;

public class Main {
    public static void main(String[] args) {
        Bolt bolt = new Bolt("Bolt");
        AngryBird angryBird = new AngryBird("Angry Bird");
        McQueen mcQueen = new McQueen("McQueen");
        Nemo nemo = new Nemo("Nemo");
        Siddeley siddeley = new Siddeley("Siddeley");

        action(bolt, angryBird, mcQueen, nemo, siddeley);

    }

    public static void action(Object ...objs) {
        for (Object obj : objs) {
            if (obj instanceof Barkable)
                ((Barkable) obj).bark();
            if (obj instanceof Flyable)
                ((Flyable) obj).fly();
            if (obj instanceof Runable)
                ((Runable) obj).run();
            if (obj instanceof Swimable)
                ((Swimable) obj).swim();
        }
    }



}
