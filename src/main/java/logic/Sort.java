package logic;

import java.util.List;

/**
 * 정렬 기능을 제공하는 인터페이스, 사용하는 타입은 정렬할 수 있게끔 {@link Comparable} 을 구현해야 한다.
 * @Param <T> 정렬할 데이터 타입
 * @author jihyun
 */


public interface Sort <T extends Comparable> { // 제네릭 타입으로 받는데, 각 타입들이 비교가 가능해야한다는 의미

    /**
     *
     *
     * @param list 정렬할 리스트
     * @return 정렬된 리스트
     */
    List<T> sort(List<T> list);

}
