package Task;

public class JumpCommand implements FrogCommand {

    private Frog frog;
    private int steps;

    public JumpCommand(Frog frog, int steps) {
        this.frog = frog;
        this.steps = steps;
    }

    @Override
    public boolean doing() {
        boolean jump = frog.jump(steps);
        return jump;
    }

    @Override
    public boolean undo() {
        boolean undo = frog.undo(steps);
        return undo;
    }
}
