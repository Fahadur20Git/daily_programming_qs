import java.util.Scanner;

public class prime_no {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int count = 0;
        for(int i = 1;i<=num;i++){
            if(num % i ==0){
            count++;
            }
        }
        if(count==2){
            System.out.println("this is prime number"+" "+num);
        }else{
            System.out.println("this is not prime numebr"+" "+num);
        }
    }
}
