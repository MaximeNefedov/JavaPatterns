package Task;

public class IntsCalculator implements Ints {
    private final Calculator target;

    public IntsCalculator() { this.target = new Calculator(); }

    @Override
    public int sum(int arg0, int arg1) {
        int result = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.SUM)
                .result();
        return result;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int result = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Operation.MULT)
                .result();
        return result;
    }

    @Override
    public int pow(int a, int b) {
        int result = (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Operation.POW)
                .result();
        return result;
    }
}
