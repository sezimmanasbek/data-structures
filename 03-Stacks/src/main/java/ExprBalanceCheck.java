import java.sql.Time;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExprBalanceCheck {
    public static void main(String[] args) {
        System.out.println("Enter expression : ");
        Scanner scanner=new Scanner(System.in);
        String expression=scanner.next();
        System.out.println(balanceCheck(expression));
        System.out.println(checkBalance(expression));
    }
    public static boolean balanceCheck(String expr){
        LocalDateTime start = LocalDateTime.now();
        MyStack<Character> myStack=new MyStack<>();
        for(int i=0;i<expr.length();i++){
        Character ch=expr.charAt(i);
        if(ch!='('&& ch!='['&& ch!='{'&& ch!=')'&&ch!=']'&& ch!='}') continue;
        if(ch=='(' || ch=='['|| ch=='{' ) {
            // Push opening symbol to stack
            myStack.push(ch);
            continue;
        }
        // At this point ch is a closing symbol
        // Stack should'nt be empty.
            if(myStack.isEmpty()) return false;
            char match;
            switch (ch){
                case ')':
                    match= myStack.pop();
                    if (match!='(') return false;
                    break;
                case ']':
                    match= myStack.pop();
                    if (match!='[') return false;
                    break;
                case '}':
                    match= myStack.pop();
                    if (match!='{') return false;
                    break;
            }
        }
        return (myStack.isEmpty());
        }


    public static boolean checkBalance(String expression){
        MyStack<Character> stack = new MyStack<>();
       Map<Character, Character> map = new HashMap<>();
       map.put('(',')');
       map.put('{','}');
       map.put('[',']');
        for(int i=0; i < expression.length();i++){
            if(map.containsKey(expression.charAt(i))){
                stack.push(map.get(expression.charAt(i)));
            }else if(map.containsValue(expression.charAt(i))){
                if(stack.pop() != expression.charAt(i)){
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }
}
