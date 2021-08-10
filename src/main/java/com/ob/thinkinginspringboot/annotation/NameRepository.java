package com.ob.thinkinginspringboot.annotation;

import java.util.Arrays;
import java.util.List;

/**
 * NameRepository
 *
 * @author oubin.ob
 * @version : NameRepository.java v 0.1 2021/8/10 23:21 oubin.ob Exp $$
 */
@StringRepository
public class NameRepository {

    public List<String> findAll() {
        return Arrays.asList("1", "2");
    }
}
