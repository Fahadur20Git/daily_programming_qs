import java.util.Scanner;

public class reverse_str {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String rev = "";
        for ( int i = str.length()-1; i>=0;i--){
            rev = rev + str.charAt(i);
            System.out.println("reverse string"+" "+rev);
        }
    }
    
}
