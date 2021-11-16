package Lesson8;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }
    public void goWall(int jump, String name){
        System.out.println(name + " подходит к стенке");
        System.out.println();
        if (jump > height) {
            System.out.println(name + " перепрыгнул стену !!!");
        }else {
            System.out.println(name + " не смог перепрыгнуть :( ");
        }
        System.out.println();
    }


}



