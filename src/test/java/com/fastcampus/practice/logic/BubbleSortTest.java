package com.fastcampus.practice.logic;

import static org.assertj.core.api.Assertions.*;

import com.fastcampus.practice.logic.BubbleSort;
import java.util.List;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    final private BubbleSort<Integer> bubbleSort = new BubbleSort<>();
    // 1. should - when         ex: thisLogicShouldSortDataWhenInsertingList
    // 2. given - when - then   ex: givenList_whenSorting_thenReturnSortedList
    @DisplayName("[버블소트] 데이터 리스트를 입력하면, 정렬된 리스트를 반환한다.")
    @Test
    void givenList_whenSorting_thenReturnSortedList(){
        // given
        List<Integer> input = List.of(5,3,1,4,2);

        // when
        List<Integer> output = bubbleSort.sort(input);

        // then
        // assertEquals(List.of(1,2,3,4,5), output); //예상값, 실제값 - junit5
        assertThat(output).isEqualTo(List.of(1,2,3,4,5)); //예상값, 실제값
    }
}