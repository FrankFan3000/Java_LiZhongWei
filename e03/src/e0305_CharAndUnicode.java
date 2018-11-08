public class e0305_CharAndUnicode {
    public static void main(String[] args){
        System.out.println("\102");
        System.out.println("\u0042");
        System.out.println("Apple\tOrange\tBanana");
        System.out.println("aaa\\\'\"\nbbb");


        byte b = 1;
        System.out.println(b);      // 00000000 00000001
        System.out.println(~b);     // 11111111 11111110

        byte c = -1;
        System.out.println(c);      // 00000000 00000001
        System.out.println(~c);     // 11111111 11111110

    }
}
