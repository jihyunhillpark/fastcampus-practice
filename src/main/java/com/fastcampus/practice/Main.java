package com.fastcampus.practice;

import com.fastcampus.practice.config.Config;
import com.fastcampus.practice.logic.BubbleSort;
import com.fastcampus.practice.logic.Sort;
import com.fastcampus.practice.service.StringSortService;
import java.util.List;
import java.util.Arrays;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        StringSortService stringSortService = context.getBean(
            StringSortService.class); // 빈을 주입할 때는 generic 정보가 날아간다.
        List<String> list = stringSortService.doSort(Arrays.asList(args));

        System.out.println("Hello World! - result: " + list.toString());
    }
}
