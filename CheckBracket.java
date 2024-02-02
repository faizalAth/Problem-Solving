import java.util.Stack;
public class CheckBracket {
    public static void main(String[] args) {
        String bracket="{(){}[({[[[{()}]]]})]}";
        
        System.out.println( checkBracket(bracket) ? "Balanced!" : "Not Balanced!");
    }

    public static boolean checkBracket(String bracket){
        Stack<Character> stack=new Stack<>();
         
        for(int i=0;i<bracket.length();i++){
            char check=bracket.charAt(i);

            if(check == '{' || check=='(' || check=='['){
                stack.push(check);
                continue;
            }

            if(stack.empty())
                return false;

            if(check == '}'){
                if(stack.peek() == '{')
                    stack.pop();
                else
                    stack.push(check);
            }else if(check == ')'){
                  if(stack.peek() == '(')
                      stack.pop();
                  else
                      stack.push(check);
            }else if(check == ']'){
                  if(stack.peek() == '[')
                      stack.pop();
                  else
                      stack.push(check);
            }
        }
        
        return stack.empty();
    }
}
