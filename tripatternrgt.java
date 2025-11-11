public class tripatternrgt {
    public static void main(String[] args) {
        int n = 5; // input
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
