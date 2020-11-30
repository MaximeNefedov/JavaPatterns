package Task;

public class Frog {
    public static final int MIN_POSITION = 0;
    public static final int MAX_POSITION = 10;
    private int position;
    private int[] field = new int[MAX_POSITION + 1];

    public Frog() {
        position = 5;
        fillField();
    }

    public boolean jump(int steps) {
        int jump = position + steps;
        if (jump > MAX_POSITION || jump < MIN_POSITION) {
            return false;
        } else {
            position = field[jump];
            System.out.println("\nВаша позиция: ");
            showField();
            return true;
        }
    }

    public boolean undo(int steps) {
        int jump = position - steps;
        if (jump > MAX_POSITION || jump < MIN_POSITION) {
            return false;
        } else {
            position = field[jump];
            System.out.println("\nВаша позиция: ");
            showField();
            return true;
        }
    }

    private void fillField() {
        for (int i = 0; i < field.length; i++) {
            field[i] = i;
        }
    }

    private void showField() {
        for (int i = 0; i < field.length; i++) {
            if (field[i] == position) {
                System.out.print(" * ");
            } else {
                System.out.print(" " + field[i] + " ");
            }
        }
    }
}
