package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int units = number % 10;
        int tens = number % 100 / 10;
        int hundreds = number / 100;
        System.out.println(units * 100 + tens * 10 + hundreds);
    }
}
