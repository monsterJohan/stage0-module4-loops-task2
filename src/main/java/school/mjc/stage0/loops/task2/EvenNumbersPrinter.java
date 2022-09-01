package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i = 0;
        while ((i+=2) <= printTillInclusive) {
            System.out.println(i);
        }
    }
}
