import java.util.Scanner;

public class e153_ReceiveInput {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please input you name:");
        String name = scan.nextLine();

        System.out.println("Please input your age:");
        int age = scan.nextInt();

        System.out.println("Please input your heigh");
        double stature = scan.nextDouble();

        System.out.println("Receive data finished.");
        System.out.println(name);
        System.out.println(age);
        System.out.println(stature);


        
    }
}
