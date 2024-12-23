//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringCalculator {

    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
    }

    public int add(String input) {
        if (input.isEmpty()) return 0;
        if (input.contains(",")) {
            String[] numbers = input.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
        return Integer.parseInt(input);
    }
}