import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for (String s : operations) {

            if (s.equals("C")) {
                stack.pop();
            } 
            else if (s.equals("D")) {
                stack.push(2 * stack.peek());
            } 
            else if (s.equals("+")) {
                int last = stack.pop();
                int sum = last + stack.peek();
                stack.push(last);   
                stack.push(sum);    
            } 
            else {
                stack.push(Integer.parseInt(s));
            }
        }
        int total = 0;
        for (int num : stack) {
            total += num;
        }

        return total;
    }
}
