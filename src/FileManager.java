import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

public class FileManager {
    Scanner consFile = new Scanner(System.in);
    String fileNameInput = consFile.nextLine();
    String fileNameOutput;

//создание объекта FileReader
    try (FileReader fr = new FileReder(fileNameInput))
    {
        char[] a = new char[100]; // количество символов, которое будем считывать
        fr.read(a); //чтение содержимого в массив
        for(char c : a) {
            System.out.print(c);//вывод символов один за другими
        }
    } catch(IOException e){
        e.printStackTrace();
    }

// запись файла
    public void writeFile(String content, String filePath) {
        try (FileWriter wf = new FileWriter(fileNameOutput)) {
            wf.write("сюда нужно подать текст / массив текста уже зашифрованный для нового файла");
            wf.flush();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}