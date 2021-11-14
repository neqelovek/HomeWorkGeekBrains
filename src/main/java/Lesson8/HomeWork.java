package Lesson8;

public class HomeWork {
    public static void main(String[] args) {

//        Не должно быть (cast)object и instanseof!
//  1. Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
//       Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//   2. Создайте два класса: беговая дорожка и стена, при прохождении через которые,
//      участники должны выполнять соответствующие действия (бежать или прыгать),
//      результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//   3. Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//       Подсказка: у препятствия должен быть метод, принимающий участника, либо наоборот
//
//    4. * У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
//    Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

        Robot robot = new Robot("R2-D2", 234, 0);
        Robot.Action robotAction = robot.new Action();

        Cat cat = new Cat("Барсик", 20, 5);
        Cat.Action catAction = cat.new Action();

        People people = new People("Артём",50, 3);
        People.Action peopleAction = people.new Action();

        Wall wall = new Wall(2);
        Treadmill treadmill = new Treadmill(40);

        robotAction.robotRun();
        robotAction.robotJump();




        System.out.println();
        catAction.catRun();
        catAction.catJump();
        System.out.println();
        peopleAction.peopleRun();
        peopleAction.peopleJump();
        System.out.println();

        treadmill.goDistance(robotAction.getRun(), robotAction.getName());
        wall.goWall(robotAction.getJump(), robotAction.getName());
        treadmill.goDistance(catAction.getRun(), catAction.getName());
        wall.goWall(catAction.getJump(), catAction.getName());
        treadmill.goDistance(peopleAction.getRun(), peopleAction.getName());
        wall.goWall(peopleAction.getJump(), peopleAction.getName());

    }

//
//        public void breakingWall(){
//            if (setRun > wall) {
//                System.out.println("asfd");
//            }
//
//        }
//
}
