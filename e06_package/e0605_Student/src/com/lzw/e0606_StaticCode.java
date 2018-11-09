package com.lzw;
import static java.lang.System.out;

public class e0606_StaticCode {
    static int count = 0;
    static {
        count = 0;
        out.println("StaticCode is loaded. Run only once!");
    }
    public e0606_StaticCode(){
        count++;
        out.println("This is No." + count + " object!");
    }
}
