import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите текст и нажмите <Enter>: ");
        String text = new Scanner(System.in).nextLine();
        System.out.println("Длина текста: " + text.length());

        // Задание по теме "Циклы"
        Scanner scanner = new Scanner(System.in);
        int correctFilesCount = 0; // Счетчик для количества верно указанных путей к файлам

        while (true) {
            String path = scanner.nextLine();
            File file = new File(path);

            if (!file.exists()) {
                System.out.println("Указанный файл не существует.");
                continue; // Переходим к следующему циклу, не выполняя дальнейшие проверки
            }

            if (file.isDirectory()) {
                System.out.println("Указанный путь является путем к папке, а не к файлу.");
                continue; // Переходим к следующему циклу, не выполняя дальнейшие проверки
            }

            // Если мы дошли до этого места, значит файл существует и является файлом
            System.out.println("Путь указан верно.");
            correctFilesCount++; // Увеличиваем счетчик верно указанных путей
            System.out.printf("Это файл номер %d%n", correctFilesCount);
        }
    }
}


