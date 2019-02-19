import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ArithmeticOperation implements IProvideArithmeticOperation {

  public Map<String, BiFunction<Long, Long, Long>> operators = new HashMap<>();

  public ArithmeticOperation() {
    operators.put("+", (x, y) -> x + y);
    operators.put("*", (x, y) -> x * y);
    operators.put("/", (x, y) -> x / y);
    operators.put("-", (x, y) -> x - y);
  }

  @Override
  public Long calculate(String operator, Long left, Long right) {
    return operators.get(operator).apply(right, left);
  }

  @Override
  public boolean isAnOperator(String token) {
    return operators.containsKey(token);
  }
}