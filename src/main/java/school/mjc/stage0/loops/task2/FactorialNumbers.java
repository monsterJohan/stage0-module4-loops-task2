package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        System.out.println(1);
        int factorial = 1;
        for (int i = 1; i <= printToInclusive; i++) {
            factorial *= i;
            System.out.println(factorial);
        }
    }
}
