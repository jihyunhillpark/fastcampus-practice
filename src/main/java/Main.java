import java.util.List;
import java.util.Arrays;
import logic.BubbleSort;
import service.StringSortService;

public class Main {

    public static void main(String[] args) {
        StringSortService stringSortService = new StringSortService(new BubbleSort<>());
        List<String> list = stringSortService.doSort(Arrays.asList(args));
        System.out.println("Hello World! - result: " + list.toString());
    }
}
