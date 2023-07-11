package ru.daniladeveloper.patterns.builder;

import java.util.concurrent.atomic.AtomicInteger;

public class RandomUtil {

    private static String CLASS_PREFIX = "class";
    private static AtomicInteger index = new AtomicInteger(0);

    public static ClassName getRandomClassName() {
        return new ClassName(CLASS_PREFIX + String.valueOf(index.incrementAndGet()));
    }
}
