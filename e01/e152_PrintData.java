import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 * 日期格式化类（必须掌握）
 * API:
 * G  Era 标志符  Text  AD  
y  年  Year  1996; 96  
M  年中的月份  Month  July; Jul; 07  
w  年中的周数  Number  27  
W  月份中的周数  Number  2  
D  年中的天数  Number  189  
d  月份中的天数  Number  10  
F  月份中的星期  Number  2  
E  星期中的天数  Text  Tuesday; Tue  
a  Am/pm 标记  Text  PM  
H  一天中的小时数（0-23）  Number  0  
k  一天中的小时数（1-24）  Number  24  
K  am/pm 中的小时数（0-11）  Number  0  
h  am/pm 中的小时数（1-12）  Number  12  
m  小时中的分钟数  Number  30  
s  分钟中的秒数  Number  55  
S  毫秒数  Number  978  
z  时区  General time zone  Pacific Standard Time; PST; GMT-08:00  
Z  时区  RFC 822 time zone  -0800  

 */

public class e152_PrintData {
    public static void main(String[] args){
        

        Date date = new Date();
        System.out.println(date);
        System.out.println(date.toLocaleString());  // 旧方法，不再使用

        //Date ------> Date对象
        //创建日期格式化对象   因为DateFormat类为抽象类 所以不能new
        System.out.println("Date to String");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss");    //多态  //2017-04-19 星期三 下午 20:17:38
        String str = dateFormat.format(date);    // 格式化
        System.out.println(str);


        //String ------->Date对象
        System.out.println("String to Date");
        String str2 = "2017-04-19 星期三 下午 20:17:38";    //有格式要求 必须和自定义模式严格一致
        try {
            Date date2 = dateFormat.parse(str2);            // String转成对象
            System.out.println(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
