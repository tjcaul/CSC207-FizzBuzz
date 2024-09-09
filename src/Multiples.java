public class Multiples {
    public static void main(String[] args) {
        int num_multiples = 0;
        for (int i = 0; i < 1000; ++i) {
            if (i % 3 == 0 || i % 5 == 0) {
                num_multiples++;
            }
        }
        System.out.println(num_multiples);
    }
}
