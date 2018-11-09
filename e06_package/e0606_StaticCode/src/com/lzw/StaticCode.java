package com.lzw;
import static java.lang.System.out;
public class StaticCode {
    static int count = 0;
    static {
        count = 0;
        out.println("StaticCode is loaded. Run only once!");
    }
    public StaticCode(){
        count++;
        out.println("This is No." + count + " object!");
    }
}
