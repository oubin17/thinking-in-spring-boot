package com.ob.thinkinginspringboot.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;

/**
 * IterationCalculatingService
 *
 * @author oubin.ob
 * @version : IterationCalculatingService.java v 0.1 2021/8/21 23:24 oubin.ob Exp $$
 */
@Service
@Profile("Java7")
public class IterationCalculatingService implements CalculatingService {
    @Override
    public Integer sum(Integer... values) {
        int sum = 0;
        for (Integer value : values) {
            sum += value;
        }
        System.out.printf("[Java7 迭代实现] %s 累加结果 ： %s\n", Arrays.asList(values), sum);
        return sum;
    }
}
