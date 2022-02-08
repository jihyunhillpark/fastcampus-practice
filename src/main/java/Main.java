import java.util.List;
import java.util.Arrays;
import logic.BubbleSort;
import service.SpringSortService;

public class Main {

    public static void main(String[] args) {
        SpringSortService springSortService = new SpringSortService(new BubbleSort<>());
        List<String> list = springSortService.doSort(Arrays.asList(args));
        System.out.println("Hello World! - result: " + list.toString());
    }
}
