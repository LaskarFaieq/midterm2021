package math;

public class Fibonacci {
    public static void main(String[] args) {
        int prev = 0;
        int next = 1;

        for (int i = 0; i <15; i++) {
            System.out.println(prev);
            prev = next - prev;
            next = next + prev;

         }
    }
}
