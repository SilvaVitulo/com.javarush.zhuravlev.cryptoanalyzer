package inputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static services.Decrypt.decrypt;
import static services.Encrypt.encrypt;
import static utilits.ConsoleMenu.READ_FILE_ERROR;
import static utilits.ConsoleMenu.SUCCESS_READ;
import static utilits.ConsoleMenu.SUCCESS_WRITE;
import static utilits.ConsoleMenu.WRITE_FILE_ERROR;
import static utilits.ConsoleMenu.repeatMenu;

public class FileManager {

    public static String readFile(String filePath, int key, int command) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {
            String line;
            while (reader.ready()) {
                line = reader.readLine();
                String result = switch (command) {
                    case 1 -> encrypt(line, key);
                    case 2 -> decrypt(line, key);
                    default -> "";
                };
                stringBuilder.append(result);
            }
            System.out.println(SUCCESS_READ);
            return stringBuilder.toString();
        } catch (IOException e) {
            return READ_FILE_ERROR;
        }
    }

    public static void writeFile(String content, String filePath) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(filePath))) {
            writer.write(content);
            System.out.println(SUCCESS_WRITE);
            repeatMenu();
        } catch (IOException e) {
            System.out.println(WRITE_FILE_ERROR);
        }
    }
}
