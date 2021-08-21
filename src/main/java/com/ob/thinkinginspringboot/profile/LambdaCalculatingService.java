package com.ob.thinkinginspringboot.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * LambdaCalculatingService
 *
 * @author oubin.ob
 * @version : LambdaCalculatingService.java v 0.1 2021/8/21 23:21 oubin.ob Exp $$
 */
@Service
@Profile("Java8")
public class LambdaCalculatingService implements CalculatingService{
    @Override
    public Integer sum(Integer... values) {
        int sum = Stream.of(values).reduce(0, Integer::sum);
        System.out.printf("[Java8 Lambda实现] %s 累加结果 ： %s\n", Arrays.asList(values), sum);
        return sum;
    }
}
