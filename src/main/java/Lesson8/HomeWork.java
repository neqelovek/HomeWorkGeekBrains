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

        Robot robot = new Robot(12, 4);
        Robot.Action robotAction = robot.new Action();
        Robot.Action robotRun = robot.new Action();
        Robot.Action robotJump = robot.new Action();
        Robot.Action setRun = robot.new Action();

        Cat cat = new Cat(223, 5);
        Cat.Action catAction = cat.new Action();
        Cat.Action catRun = cat.new Action();
        Cat.Action catJump = cat.new Action();

        People people = new People(50, 2);
        People.Action peopleAction = people.new Action();
        People.Action peopleRun = people.new Action();
        People.Action peopleJump = people.new Action();

        Wall wall = new Wall(40);


        robotAction.robotRun();
        robotAction.robotJump();
        System.out.println();
        catAction.catRun();
        catAction.catJump();
        System.out.println();
        peopleAction.peopleRun();
        peopleAction.peopleJump();
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
