package com.lzw;
import static java.lang.System.out;

public class Math {
    public static void main(String[] args){
        out.println(Math.class.getName());           // 输出类的全称
        out.println(java.lang.Math.class.getName()); // 输出另一个Math类的全称
        out.println("I'm not java.lang.Math class, but com.lzw.Math class");
    }
}
