package Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Игра \"лягушка\"\n" +
                "Список доступных команд: " +
                "\n1) +N - прыгни на N шагов направо" +
                "\n2) -N - прыгни на N шагов налево" +
                "\n3) << - Undo (отмени последнюю команду)" +
                "\n4) >> - Redo (повтори отменённую команду)" +
                "\n5) !! - повтори последнюю команду" +
                "\n6) 0 - выход");

        Frog frog = new Frog();
        List<FrogCommand> commands = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int curCommand = -1;

        while (true) {
            System.out.println("\nВведите команду:");
            String input = scanner.nextLine();

            if (input.matches("-?\\d+")) {
                int value = Integer.parseInt(input);

                if (value == 0) {
                    break;
                }

                if (curCommand != commands.size() - 1) {
                    int x = (commands.size() - 1) - curCommand;
                    for (int i = commands.size() - 1; i > x; i--) {
                        commands.remove(i);
                    }
                }

                FrogCommand command = new JumpCommand(frog, value);
                boolean doing = command.doing();
                if (!doing) {
                    System.out.println("Прыжок слишком большой");
                } else {
                    curCommand++;
                }
                commands.add(command);

            } else if (input.equals("<<")) {
                if (curCommand < 0) {
                    System.out.println("Нечего отменять!");
                } else {
                    boolean undo = commands.get(curCommand).undo();
                    if (!undo) {
                        System.out.println("Ошибка отмены");
                    } else {
                        curCommand--;
                    }
                }

            } else if (input.equals(">>")) {
                if (curCommand == commands.size() - 1) {
                    System.out.println("Нечего отменять!");
                } else {
                    curCommand++;
                    boolean doing = commands.get(curCommand).doing();
                    if (!doing) {
                        System.out.println("Ошибка повтора комадны");
                    }
                }
            } else if (input.equals("!!")) {
                boolean doing = commands.get(commands.size() - 1).doing();
                if (!doing) {
                    System.out.println("Прыжок слишком большой");
                } else {
                    curCommand++;
                }
            }
        }
    }
}
