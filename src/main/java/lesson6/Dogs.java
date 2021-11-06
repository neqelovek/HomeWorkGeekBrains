package lesson6;

public class Dogs extends Animals {
    public static int dogsCounter;

    public Dogs(String name, int run, int swim) {
        super(name, run, swim, 500, 10);
        dogsCounter++;

    }
}
