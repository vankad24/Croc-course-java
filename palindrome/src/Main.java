import java.util.Scanner;

/**
 * Класс, который проверяет, является ли введенная строка палиндромом.
 */
public class Main {

    /**
     * Главный метод программы.
     *
     * @param args Аргументы командной строки (не используются в данной программе).
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Выводим приглашение для ввода строки
        System.out.println("Введите любую строку:");

        // Считываем введенную строку
        var line = in.nextLine();

        // Приводим строку к нижнему регистру и удаляем из нее пунктуацию и пробелы
        line = line.toLowerCase().replaceAll("[\\.,!?\\s]", "");

        // Выводим отформатированную строку
        System.out.println(line);

        // Проверяем, является ли строка палиндромом и выводим соответствующее сообщение
        if (isPalindrome(line)) {
            System.out.println("Это палиндром");
        } else {
            System.out.println("Это не палиндром");
        }
    }

    /**
     * Метод для проверки, является ли строка палиндромом.
     *
     * @param s Строка, которую нужно проверить.
     * @return true, если строка является палиндромом, и false в противном случае.
     */
    static boolean isPalindrome(String s) {
        var l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
