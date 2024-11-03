package IO;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static Services.Decrypt.decrypt;
import static Services.Encrypt.encrypt;
import static Utilits.ConsoleMenu.*;

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
        } catch (IOExeption e) {
            return READ_FILE_ERROR;
        }
    }

    public void writeFile(String content, String filePath) {
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of(filePath))) {
            writer.write(content);
            System.out.println(SUCCESS_WRITE);
            repeatMenu();
        } catch (IOException e) {
            System.out.println(WRITE_FILE_ERROR);
        }
    }
}
