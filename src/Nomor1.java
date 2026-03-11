import java.util.Scanner;
import java.util.Stack;

public class Nomor1 {

    public static boolean is_balanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // opening bracket
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // closing bracket
            else if (c == ')' || c == '}' || c == ']') {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan string bracket: ");
        String s = input.nextLine();

        boolean result = is_balanced(s);

        System.out.println("Balanced? " + result);
    }
}