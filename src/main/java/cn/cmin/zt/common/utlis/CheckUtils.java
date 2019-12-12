package cn.cmin.zt.common.utlis;

import java.util.Arrays;

public class CheckUtils {

    /***
     * 判断可变参数是否全都不为空
     * @param args
     * @return
     */
    public static boolean isAnyEmpty(String... args) {
        if (args == null || args.length==0) return false;
        for (String arg : args) {
            if (arg == null || arg.length() == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断引用类型数组是否为空
     *
     * @param arr
     * @return
     */
    public static boolean isEmpty(Object[] arr) {
        return arr == null || arr.length == 0;
    }

    /**
     * 判断 str1 字符串是否相等
     *
     * @param str1
     * @param str2
     * @return
     */
    public static boolean equals(String str1, String str2) {
        return str1 != null && str2 != null && str1.equals(str2);
    }

    /**
     * 判断 Integer n1 和 n2 的值是否相等
     *
     * @param n1
     * @param n2
     * @return
     */
    public static boolean equals(Integer n1, Integer n2) {
        return n1 != null && n2 != null && n1.intValue() == n2.intValue();
    }

}
