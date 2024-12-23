//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class StringCalculator {

    public static void main(String[] args) {
        System.out.print("Hello and welcome!");
    }

    public int add(String input) {
        if (input.isEmpty()) return 0;
        return Integer.parseInt(input);
    }
}