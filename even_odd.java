import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%2==0){
            System.out.println("this is even");
        }else{
            System.out.println("this is odd");
        }
    }
}
