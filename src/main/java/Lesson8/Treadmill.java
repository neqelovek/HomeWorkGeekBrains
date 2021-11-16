package Lesson8;

public class Treadmill {
    public int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }
    public void goDistance(int run, String name){
        System.out.println(name + " подходит к беговой дорожке");
        System.out.println();
        if (run > distance) {
            System.out.println(name + " пробежал дистанцию!!!");
        }else {
            System.out.println(name + " не смог пройти дистанцию :( ");
        }
        System.out.println();
    }
}
