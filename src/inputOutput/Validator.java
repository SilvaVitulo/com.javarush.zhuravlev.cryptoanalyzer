package inputOutput;

import java.nio.file.Files;
import java.nio.file.Path;

import static utilits.ConsoleMenu.FILE_FOUND;
import static utilits.ConsoleMenu.FILE_NOT_FOUND;
import static utilits.ConsoleMenu.KEY_ERROR;
import static utilits.ConsoleMenu.repeatMenu;


public class Validator {
    public static int validateKey(String keyStr) {
        try {
            return Integer.parseInt(keyStr);
        } catch (NumberFormatException e) {
            System.out.println(KEY_ERROR);
            return -1;
        }
    }
    public static boolean isFileExists(String filePath) {
        if(Files.exists(Path.of(filePath))) {
            System.out.printf(FILE_FOUND, filePath);
            return true;
        } else {
            System.out.printf(FILE_NOT_FOUND, filePath);
            repeatMenu();
            return false;
        }
    }
}
