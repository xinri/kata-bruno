import java.util.Stack;

public class RnpCalculator {

  private final IProvideArithmeticOperation iProvideArithmeticOperation;


  RnpCalculator() {
    this(new ArithmeticOperation());
  }


  RnpCalculator(IProvideArithmeticOperation iProvideArithmeticOperation) {
    this.iProvideArithmeticOperation = iProvideArithmeticOperation;
  }

  public String calculate(String expression) {
    String[] tokens = expression.split(" ");
    Stack<Long> stack = new Stack();

    for (String token : tokens) {
      if (!iProvideArithmeticOperation.isAnOperator(token)) {
        stack.push(Long.parseLong(token));
      } else {
        Long pop1 = stack.pop();
        Long pop2 = stack.pop();
        stack.push(iProvideArithmeticOperation.calculate(token, pop1, pop2));
      }
    }
    return String.valueOf(stack.pop());
  }

}
