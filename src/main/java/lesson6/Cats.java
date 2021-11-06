package lesson6;

public class Cats extends Animals {
    public static int catCounter;

    public Cats(String name, int run, int swim) {
        super(name, run, swim, 200, -1);
        catCounter++;
    }
}
