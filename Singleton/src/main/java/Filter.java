import java.util.ArrayList;
import java.util.List;

public class Filter {
    private int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();
        logger.log("Запускаем фильтрацию");
        int successCounter = 0;
        int maxValue = source.size();
        for (int i = 0; i < source.size(); i++) {
            if (source.get(i) < treshold) {
                logger.log("Элемент " + source.get(i) + " не проходит");
            } else {
                logger.log("Элемент " + source.get(i) + " проходит");
                result.add(source.get(i));
                successCounter++;
            }
        }
        logger.log("Прошло фильтр " + successCounter + " " + getElementAddition(successCounter) + " из " + maxValue);
        return result;
    }

    private String getElementAddition(int num) {

        int preLastDigit = num % 100 / 10;

        if (preLastDigit == 1) {
            return "элементов";
        }

        switch (num % 10) {
            case 1:
                return "элемент";
            case 2:
            case 3:
            case 4:
                return "элемента";
            default:
                return "элементов";
        }
    }
}
