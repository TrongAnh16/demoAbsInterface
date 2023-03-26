import abs.Machine;

public class McQueen extends Machine implements Runnable {

    public McQueen(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(name + " chạy như 1 chiếc xe đua");
    }
}
