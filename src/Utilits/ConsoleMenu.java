package Utilits;

public class ConsoleMenu {

    public static final String ENTER_INPUT_FILE = "Введите путь к входному файлу с расширением .txt: ";
    public static final String ENTER_OUTPUT_FILE = "Введите путь к выходному файлу с расширением .txt: ";
    public static final String ENTER_KEY = "Введите ключ шифрование в виде целого числа: ";
    public static final String SUCCESS_MESSAGE = "\uD83C\uDF8A Операция успешно выполнена! \uD83C\uDF8A";
    public static final String SUCCESS_WRITE = "Запись успешно завершена.";
    public static final String SUCCESS_READ = "Файл успешно прочитан.";
    public static final String READ_FILE_ERROR = "Чтение файла прошло с ошибкой, можно попробовать ещё разок ;)";
    public static final String WRITE_FILE_ERROR = "Запись файла прошла с ошибкой!";
    public static final String MENU_TEXT_ERROR = "Такой пункт меню отсутствует! Выберите из существующих!";
    public static final String KEY_ERROR = "Введён не допустимый ключ шифрования.";
    public static final String FILE_FOUND = "Файл %s найден!\n";

    public static void printGreeting() {
        System.out.println("*****************************************");
        System.out.println("*******Hello! I'm cryptoAnalyzer*********");
        System.out.println("*****************************************");
    }

    public static void makeChoice() {
        System.out.println("Укажите цифру пункта ниже:");
        System.out.println("1 - Зашифровать сообщение, используюя шифр Цезаря.");
        System.out.println("2 - Расшифровать сообщение, используюя шифр Цезаря.");
        System.out.println("3 - Закончить работу в программе.");
    }

    public static void repeatMenu(){
        System.out.println("*****Продолжить работу в программе?*****");
        System.out.println("*****************************************");
    }
}
