import java.util.Stack;

public class RemoveOuterMostParanthesis {
    public static void main(String[] args) {

    }
}
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        int count = 0;


        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {
                count--;
            }
            if (count > 0) {
                ans.append(ch);
            }
            if (ch == '(') {
                count++;
            }
        }
        return ans.toString();
    }
}