package service;

import java.util.List;
import logic.BubbleSort;
import logic.Sort;

public class SpringSortService {

    private final Sort<String> sort;

    public SpringSortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> doSort(List<String> input) {
        return sort.sort(input);
    }
}
