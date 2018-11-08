
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/*
 * ���ڸ�ʽ���ࣨ�������գ�
 * API:
 * G  Era ��־��  Text  AD  
y  ��  Year  1996; 96  
M  ���е��·�  Month  July; Jul; 07  
w  ���е�����  Number  27  
W  �·��е�����  Number  2  
D  ���е�����  Number  189  
d  �·��е�����  Number  10  
F  �·��е�����  Number  2  
E  �����е�����  Text  Tuesday; Tue  
a  Am/pm ���  Text  PM  
H  һ���е�Сʱ����0-23��  Number  0  
k  һ���е�Сʱ����1-24��  Number  24  
K  am/pm �е�Сʱ����0-11��  Number  0  
h  am/pm �е�Сʱ����1-12��  Number  12  
m  Сʱ�еķ�����  Number  30  
s  �����е�����  Number  55  
S  ������  Number  978  
z  ʱ��  General time zone  Pacific Standard Time; PST; GMT-08:00  
Z  ʱ��  RFC 822 time zone  -0800  

 */

public class StudyJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		
		Date date = new Date();
        System.out.println(date);
        System.out.println(date.toLocaleString());  // �ɷ���������ʹ��

        //Date ------> Date����
        //�������ڸ�ʽ������   ��ΪDateFormat��Ϊ������ ���Բ���new
        System.out.println("//////// Date to String");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd E a HH:mm:ss");    //��̬  //2017-04-19 ������ ���� 20:17:38
        String str = dateFormat.format(date);    // ��ʽ��
        System.out.println(str);


        //String ------->Date����
        System.out.println("//////// String to Date");
        String str2 = "2017-04-19 ������ ���� 20:17:38";    //�и�ʽҪ�� ������Զ���ģʽ�ϸ�һ��
        try {
            Date date2 = dateFormat.parse(str2);            // Stringת�ɶ���
            System.out.println(date2);
        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
