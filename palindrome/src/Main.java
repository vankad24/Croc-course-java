import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любую строку:"); // Просим пользователя ввести строку
        var line = in.nextLine();
        line = line.toLowerCase().replaceAll("[\\.,!?\\s]", ""); // Приводим строку к нижнему регистру и удаляем знаки препинания и пробелы
        if (isPalindrome(line)) {
            System.out.println("Это палиндром"); // Если строка - палиндром, выводим сообщение
        } else {
            System.out.println("Это не палиндром"); // Если строка не является палиндромом, выводим сообщение
        }
    }

    static boolean isPalindrome(String s) {
        var l = s.length();
        for (int i = 0; i < l / 2; i++) {
            if (s.charAt(i) != s.charAt(l - i - 1)) return false; // Проверяем, является ли строка палиндромом
        }
        return true;
    }
}