public class altertricrt {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            int bit = (i % 2 == 1) ? 0 : 1; 
            for (int j = 1; j < i + 1; j++) {
                System.out.print(bit);
                bit = 1 - bit;
            }
            System.out.println();
        }
    }
}
