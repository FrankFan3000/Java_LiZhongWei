package com.lzw;
import static java.lang.System.out;
public class e0606_StaticDemo {
    static{
        out.println("StaticDemo is loaded!");
    }
    public static void main(String[] args){
        out.println("This is main function.");
        e0606_StaticCode code1 = new e0606_StaticCode();
        e0606_StaticCode code2 = new e0606_StaticCode();
        e0606_StaticCode code3 = new e0606_StaticCode();
    }
}
