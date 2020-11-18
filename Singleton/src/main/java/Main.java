import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка");
        int size = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений");
        int maxValue = scanner.nextInt();

        logger.log("Создаём список");
        List<Integer> list = new ArrayList<>(size);
        List<Integer> filledList = fillList(list, size, maxValue);
        logger.log("Выводим список в консоль");
        System.out.println("Заполненный список: " + filledList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите входные данные для фильтрации");
        int threshold = scanner.nextInt();

        Filter filter = new Filter(threshold);
        List<Integer> sortedList = filter.filterOut(filledList);
        logger.log("Выводим результат на экран");
        System.out.println("Отсортированный список: " + sortedList);
        logger.log("Завершаем программу");

    }

    public static List<Integer> fillList(List<Integer> list, int size, int maxValue) {
        Logger logger = Logger.getInstance();
        logger.log("Заполняем список");
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(maxValue));
        }
        return list;
    }


}
