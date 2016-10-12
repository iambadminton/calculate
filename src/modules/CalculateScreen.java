package modules;
public class CalculateScreen {
	private Operation ops = new OpAdd();
	private ResultWriter wtr = new ScreenWriter();

	public static void main(String[] args) {
		CalculateScreen calc = new CalculateScreen();
		calc.execute(args);
	}

	public void execute(String [] args) {
		long op1 = Long.parseLong(args[0]);
		long op2 = Long.parseLong(args[1]);
		wtr.showResult("The result of " + op1 + ops.getOpsName() + op2 + " is " + ops.operate(op1, op2) + "!");
	}
}