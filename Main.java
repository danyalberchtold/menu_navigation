package ch.prealpha;

import ch.prealpha.kernel.Commands;
import ch.prealpha.ui.Menu;
import java.util.Scanner;

public class Main {
    public static final Scanner userInput = new Scanner(System.in);
    public static boolean loop = true;

    public static void main(String[] args) {
        Menu.printWelcomeMessage();

        do {
            Menu.printMainMenu();
            Menu.printCmd();
            setCommandInput(userInput.nextLine());
        } while(loop);

        userInput.close();
    }
    private static void setCommandInput(String userCommand) {
        switch (userCommand) {
            case "quit" -> Menu.printQuit();
            case "date" -> Menu.printDate(Commands.returnDate());
            case "time" -> Menu.printTime(Commands.returnTime());
        }
    }
}
