import java.io.InputStream;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        // Вспомогательные методы: validateInput(), createAlphabet(), shiftCharacter(), readFile(), writeFile()
        System.out.println("*".repeat(50));
        System.out.println("Добро пожаловать в приложение \"Шифр Цезаря!\"");
        System.out.println("Введите № пункта меню для начала работы:");
        System.out.println("1. Шифрование");
        System.out.println("2. Расшифровка с ключом");
        System.out.println("3. Brute force");
        System.out.println("4. Статистический анализ");
        System.out.println("0. Выход");
        System.out.println("*".repeat(50));
        System.out.print("№ меню: ");

        Scanner console = new Scanner(System.in);
        int num_menu = console.nextInt();

        if (num_menu == 1) {
            System.out.println("Запускаю режим шифрования документа!");
            System.out.println("Введите полный адрес до файла с текстом для шифрования:");
        } else if (num_menu == 2) {
            System.out.println("Запускаю функцию расшифровки документа по ключу!");
        } else if (num_menu == 3) {
            System.out.println("Реализация метода brute force для перебора всех ключей до успешного расшифрования в данный момент находится в разработке,\n" +
                    "от лица нашей компании приносим свои глубочайшие извиннения!! =,(");
        } else if(num_menu == 4) {
            System.out.println("Статистический анализ?... что это такое? извините я до этого ещё не дошел =(");
        } else if(num_menu == 0){
            System.out.println("До скорой встречи!");
        }


//        InputStream


            // Пример вызова метода шифрования:
            // cipher.encrypt("input.txt", "output.txt", 3);
        }
    }

