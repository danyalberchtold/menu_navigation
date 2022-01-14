package ch.prealpha.kernel;

import ch.prealpha.Main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Commands {
    public static void println(String a, boolean nextLine) {
        if(nextLine) {
            System.out.println(a+"\n");
        } else {
            System.out.println(a);
        }
    }
    public static void print(String a, boolean nextLine) {
        if(nextLine) {
            System.out.print(a+"\n");
        } else {
            System.out.print(a);
        }
    }
    public static String returnDate() {
        LocalDate date = LocalDate.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return date.format(myFormatObj);
    }
    public static String returnTime() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("HH:mm:ss");
        return time.format(myFormatObj);
    }
    public static void returnQuit() {
        String s = Main.userInput.nextLine();
        if(s.equals("y")) {
            Main.loop = false;
            Commands.println("Bye.", false);
        }
    }
}
