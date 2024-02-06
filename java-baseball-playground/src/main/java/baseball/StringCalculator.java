package baseball;

import java.util.Scanner;

public class StringCalculator {
    public void printResult() {
        String value = new Scanner(System.in).nextLine();
        String[] values = value.split(" ");
        int result = Integer.parseInt(values[0]);
        int idx = 1;
        while (idx < values.length) {
            String operator = values[idx++];
            int target = Integer.parseInt(values[idx++]);
            result = calculate(result, operator, target);
        }
        System.out.println(result);
    }

    public int calculate(int result, String operator, int target) {
        if (operator.equals("+")) {
            return result + target;
        } else if (operator.equals("-")) {
            return result - target;
        } else if (operator.equals("*")) {
            return result * target;
        } else if (operator.equals("/")) {
            return result / target;
        }
        throw new ArithmeticException();
    }
}
