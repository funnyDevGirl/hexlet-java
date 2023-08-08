package io.hexlet;
import org.apache.commons.lang3.StringUtils;

public class One {
    public static void main(String[] args) {
        System.out.println(reverseString("Hexlet"));
    }
    public static String reverseString(String str) {
        return StringUtils.reverse(str);
    }
}