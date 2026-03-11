import java.util.Stack;

public class Nomor1 {

    public static boolean is_balanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // jika opening bracket
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }

            // jika closing bracket
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

        String s1 = "{[()]}";
        String s2 = "{[([)]]}";
        String s3 = "";

        System.out.println(s1 + " -> " + is_balanced(s1));
        System.out.println(s2 + " -> " + is_balanced(s2));
        System.out.println("Empty -> " + is_balanced(s3));
    }
}