import java.util.Scanner;

public class sum_of_Nno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;
        for(int i = 1; i<=n;i++){
            sum = sum+i;
            System.out.println("the sum of natural number is"+" "+i+" "+"is"+" "+sum);
        }
    }
}
