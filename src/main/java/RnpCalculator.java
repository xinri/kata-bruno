import java.util.Stack;

public class RnpCalculator {


  public String calculate(String expression) {
    String[] tokens = expression.split(" ");
    Stack<Long> stack = new Stack();

    for (String token : tokens) {
      if (!isOperator(token)) {
        stack.push(Long.parseLong(token));
      } else {
        Long pop1 = stack.pop();
        Long pop2 = stack.pop();
        if ("+".equals(token)) {
          stack.push(pop1 + pop2);
        }
        if ("-".equals(token)) {
          stack.push(pop2 - pop1);
        }
        if ("*".equals(token)) {
          stack.push(pop1 * pop2);
        }
        if ("/".equals(token)) {
          stack.push(pop2 / pop1);
        }
      }
    }
    return String.valueOf(stack.pop());

  }

  private boolean isOperator(String token) {
    return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
  }
}
