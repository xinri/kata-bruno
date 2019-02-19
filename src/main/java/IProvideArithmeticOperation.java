public interface IProvideArithmeticOperation {

  Long calculate(String operator, Long left, Long right);

  boolean isAnOperator(String token);

}
