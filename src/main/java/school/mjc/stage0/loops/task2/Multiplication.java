package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        for (int i = 0; i <= Math.abs(multiplyByAndToInclusive); i++) {
            if (multiplyByAndToInclusive > 0) {
                System.out.println(i * Math.abs(multiplyByAndToInclusive));
            } else if (multiplyByAndToInclusive < 0){
                System.out.println(i * multiplyByAndToInclusive);
            } else {
                System.out.print("");
            }
        }
    }
}
