import java.util.Scanner;

public class remdup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n], b = new int[n];
        System.out.println("enter the number: ");
        for (int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            boolean f = false;
            for (int j = 0; j < k; j++)
                if (a[i] == b[j]) { f = true; break; }
            if (!f) b[k++] = a[i];
        }
        for (int i = 0; i < k; i++) System.out.print(b[i] + " ");
    }
}
