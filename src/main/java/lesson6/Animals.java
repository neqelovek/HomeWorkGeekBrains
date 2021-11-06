package lesson6;

public abstract class Animals {

    private String name;
    private int run;
    private int swim;
    private final int maxRunDistance;
    private final int maxSwimDistance;
    private static int animalsCounter;

    public Animals(String name, int run, int swim, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.run = run;
        this.swim = swim;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        animalsCounter++;
    }

    public static int getAnimalsCounter() {
        return animalsCounter;
    }

    public static void setAnimalsCounter(int animalsCounter) {
        Animals.animalsCounter = animalsCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    public void goDistance() {
        System.out.println((getRun() > maxRunDistance && getSwim() > maxSwimDistance));
    }
}

