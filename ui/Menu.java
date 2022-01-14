package ch.prealpha.ui;

import ch.prealpha.kernel.Commands;

public class Menu {
    public static void printWelcomeMessage() {
        Commands.println("welcome to this very useful application!", true);
    }
    public static void printMainMenu() {
        Commands.println("main menu:", true);
        Commands.println("enter 'date' to get the current date.", false);
        Commands.println("enter 'time' to get the current time.", false);
        Commands.println("enter 'quit' to exit this application.", true);
    }
    public static void printCmd() {
        Commands.print("> ", false);
    }
    public static void printTime(String time) {
        Commands.println("the current time is "+ time, true);
    }
    public static void printDate(String date) {
        Commands.println("the current date is "+ date, true);
    }
    public static void printQuit() {
        Commands.println("are you sure that you want to exit this application? (y or n)", true);
        printCmd();
        Commands.returnQuit();
    }
}
