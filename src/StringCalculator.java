import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringCalculator {

    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
    }

    public int add(String input) {
        if (input.isEmpty()) return 0;
        String delimiter = "[,\\n]";
        if (input.startsWith("//")) {
            int delimiterIndex = input.indexOf("\\n");
            delimiter = Pattern.quote(input.substring(2, delimiterIndex));
            input = input.substring(delimiterIndex + 2);
        }

        String[] numbers = input.split(delimiter);
        List<Integer> negatives = new ArrayList<>();
        int sum = 0;
        for (String number : numbers) {
            int num = Integer.parseInt(number);
            if (num < 0) negatives.add(num);
            else sum += num;
        }

        if (!negatives.isEmpty()) {
            throw new IllegalArgumentException("Negatives not allowed: " + negatives);
        }

        return sum;
    }
}