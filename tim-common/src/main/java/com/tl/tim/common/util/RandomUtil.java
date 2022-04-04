package com.tl.tim.common.util;



/**
 *
 * @since JDK 1.8
 */
public class RandomUtil {

    public static int getRandom() {

        double random = Math.random();
        return (int) (random * 100);
    }
}
