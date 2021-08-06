package src;

import java.math.BigInteger;

/**
 * @author beichenhpy
 * @version 1.0.0
 * @apiNote 3x+1 问题
 * @since 2021/8/6 22:01
 */
public class ThreeXPlusOne {


    public static void work(BigInteger initValue) {
        BigInteger time = BigInteger.ZERO;
        //init
        System.out.println("initValue:" + initValue);
        do {
            time = time.add(BigInteger.ONE);
            //even
            if (initValue.mod(BigInteger.TWO).compareTo(BigInteger.ZERO) == 0) {
                initValue = initValue.divide(BigInteger.TWO);
            } else {
                //old
                initValue = initValue.multiply(BigInteger.valueOf(3L)).add(BigInteger.ONE);
            }
            print(20, time.toString(), initValue.toString());
        } while (initValue.compareTo(BigInteger.ONE) != 0);
    }


    private static void print(int blank, String left, String right) {
        String sb = left +
                "-".repeat(blank - left.length()) +
                ">[ " +
                right + " ]";
        System.out.println(sb);
    }

    public static void main(String[] args) {
        BigInteger initValue = new BigInteger("78").pow(6).add(BigInteger.ONE);
        work(initValue);
    }

}
