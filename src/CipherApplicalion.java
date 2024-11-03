import IO.FileManager;

import java.util.Scanner;

import static Utilits.ConsoleMenu.*;
import static jdk.xml.internal.SecuritySupport.isFileExists;

public class CipherApplicalion {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean isRunning = true;
        printGreeting();
        while (isRunning) {
            makeChoice();
            try{
                int option = Integer.parseInt(console.nextLine());
                switch (option) {
                    case 0:
                        System.out.println("Всего Вам Доброго!");
                        isRunning = false;
                        break;
                    case 1:
                    case 2:
                        executeCipherOperation (option, console);
                        break;
                    default:
                        System.out.println(MENU_TEXT_ERROR);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("Что-то поломалось, попробуйте ещё раз =\\ ");
                console.nextLine();
            }
        }
    }
    private static void executeCipherOperation(int option, Scanner console) {
        System.out.println(ENTER_KEY);
        int key = validateKey(console.nextLine());

        System.out.println(ENTER_INPUT_FILE);
        String inputFilePath = console.nextLine();

        System.out.println(ENTER_OUTPUT_FILE);
        String outputFilePath = console.nextLine();

        if(isFileExists(inputFilePath)) {
            FileManager.writeFile(FileManager.readFile(inputFilePath, key, option), outputFilePath);
            System.out.println(SUCCESS_MESSAGE);
        }

    }
}
