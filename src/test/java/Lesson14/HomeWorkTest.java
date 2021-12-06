package Lesson14;

import org.junit.jupiter.api.*;

import java.io.IOException;
import java.util.logging.*;

class HomeWorkTest {
    protected static final Logger logger = Logger.getLogger("TestHomeWork");
    Handler handler = new FileHandler("src/main/resources/logs/HomeWorkLoggers.log");


    private HomeWork homeWork;

    HomeWorkTest() throws IOException {
    }


    @BeforeEach
    void start() {
        logger.addHandler(handler);
        logger.getHandlers()[0].setFormatter(new SimpleFormatter());

        System.out.println("Тест начинается!");
        homeWork = new HomeWork();
    }

    @AfterEach
    void end() {
        System.out.println("Тест завершен!");

    }


    @DisplayName("Тест задание 7")
    @Test
    void toTask7Test1() {
        logger.info("Тест начинается!");
        Assertions.assertTrue(homeWork.checkBalanceToTask7(new int[]{1, 1, 1, 1, 2, 2}));
    }


    @DisplayName("Тест задание 7")
    @Test
    void toTask7Test2() {
        logger.warning("Может быть такая ошибка");
        Assertions.assertTrue(homeWork.checkBalanceToTask7(new int[]{1, 1, 1, 1, 1, 2, 2}));

    }

    @DisplayName("Тест задание 7")
    @Test
    void toTask7Test3() {
        Assertions.assertTrue(homeWork.checkBalanceToTask7(new int[]{2, 1, 1, 1, 1, 1, 2, 2, 1}));
    }

    @DisplayName("Тест задание 7")
    @Test
    void toTask7Test4() {
        logger.warning("Может быть такая ошибка");
        Assertions.assertTrue(homeWork.checkBalanceToTask7(new int[]{1, 1, 1, 1, 1, 2, 2, 3}));
    }


    @DisplayName("Смещение в право")
    @Test
    void toTask8Test5() {

        Assertions.assertArrayEquals
                (new int[]{1, 1, 2, 1, 1, 1}, homeWork.shiftingNumberToTask8(new int[]{2, 1, 1, 1, 1, 1}, 2));
    }

    @DisplayName("Смещение в право")
    @Test
    void toTask8Test6() {
        logger.warning("Может быть такая ошибка");
        Assertions.assertArrayEquals
                (new int[]{1, 1, 2, 1, 1, 1, 1}, homeWork.shiftingNumberToTask8(new int[]{2, 1, 1, 1, 1, 1}, 2));
    }

    @DisplayName("Смещение в лево")
    @Test
    void toTask8Test7() {

        Assertions.assertArrayEquals
                (new int[]{1, 1, 1, 2, 1, 1}, homeWork.shiftingNumberToTask8(new int[]{2, 1, 1, 1, 1, 1}, -3));
    }

    @DisplayName("Смещение в лево")
    @Test
    void toTask8Test8() {

        logger.info("Тест завершен!");
        logger.warning("Может быть такая ошибка");
        Assertions.assertArrayEquals
                (new int[]{1, 1, 1, 2, 1, 1, 1}, homeWork.shiftingNumberToTask8(new int[]{2, 1, 1, 1, 1, 1}, -3));
    }



}