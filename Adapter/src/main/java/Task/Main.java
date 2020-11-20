package Task;
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(
                calc.newFormula()
                        .addOperand(5)
                        .addOperand(15)
                        .calculate(Operation.MULT)
                        .result()
        );

        Ints ints = new IntsCalculator();
        int sum = ints.sum(5, 15);
        System.out.println(sum);

        int mult = ints.mult(5, 15);
        System.out.println(mult);

        int pow = ints.pow(5, 2);
        System.out.println(pow);
    }
}
