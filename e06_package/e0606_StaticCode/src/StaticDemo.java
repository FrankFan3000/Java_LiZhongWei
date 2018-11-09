import static java.lang.System.out;
import com.lzw.StaticCode;

public class StaticDemo {
    static{
        out.println("StaticDemo is loaded!");
    }
    public static void main(String[] args){
        out.println("This is main function.");
        StaticCode code1 = new StaticCode();
        StaticCode code2 = new StaticCode();
        StaticCode code3 = new StaticCode();
    }
}
