import java.util.Scanner;

public class large_num {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a");
        int a = scan.nextInt();
        System.out.println("enter b");
        int b = scan.nextInt();

        if(a>=b)
        {
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }

    }
}
