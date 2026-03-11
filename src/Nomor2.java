import java.util.Scanner;
import java.util.Stack;

public class Nomor2 {

    public static int evaluate_rpn(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {

            if (token.equals("+") || token.equals("-") ||
                token.equals("*") || token.equals("/")) {

                int b = stack.pop();
                int a = stack.pop();
                int result = 0;

                switch (token) {
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        result = a / b; // integer division
                        break;
                }

                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop() + 13; // ALWAYS ADD 13
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah token: ");
        int n = input.nextInt();

        String[] tokens = new String[n];

        System.out.println("Masukkan token RPN:");
        for (int i = 0; i < n; i++) {
            tokens[i] = input.next();
        }

        int result = evaluate_rpn(tokens);

        System.out.println("Hasil: " + result);
    }
}