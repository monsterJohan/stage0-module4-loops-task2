package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power >= 0) {
            int res = 1;
            while(power-- >= 0) {
                System.out.println(res);
                res <<= 1;
            }
        } else {
            System.out.println("too much power");
        }
    }
}
