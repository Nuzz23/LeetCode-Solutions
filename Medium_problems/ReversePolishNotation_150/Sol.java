package Medium_problems.ReversePolishNotation_150;

import java.util.Stack;

public class Sol {
    public static void main(String[] args) {
        System.out.println(ReversePolishNotation_150(new String[]{"4","13","5","/","+"}));
    }

    public static int ReversePolishNotation_150(String tokens[]){
        Stack<Integer> stack =  new Stack<>();

        for(String s : tokens)
            switch (s) {
                case "+":
                    stack.push(stack.pop()+stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop()+stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop()*stack.pop());
                    break;
                case "/":  
                   stack.push(Double.valueOf(1.0/stack.pop()*stack.pop()).intValue());
                   break;
                default:
                    stack.push(Integer.valueOf(s));
                    break;
            }
        
        return stack.pop();
    }
}
