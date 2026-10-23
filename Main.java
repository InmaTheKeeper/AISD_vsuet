import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите значения в формате [1, 0, 1, 1, 1]:");

        String input = scanner.nextLine().trim();

        // 1. Проверка на пустую строку
        if (input.isEmpty()) {
            System.out.println("Ошибка: пустой ввод.");
            return;
        }

        // 2. Проверка на наличие скобок
        if (!input.startsWith("[") || !input.endsWith("]")) {
            System.out.println("Ошибка: ввод должен быть в формате [1, 0, 1, 1, 1].");
            return;
        }
        // Убираем скобки и пробелы
        String cleaned = input.substring(1, input.length() - 1).replace(" ", "");

        // 3. Проверка на пустое содержимое скобок
        if (cleaned.isEmpty()) {
            System.out.println("Ошибка: внутри скобок нет значений.");
            return;
        }

        int employees = 0;
        String[] parts = cleaned.split(",");

        for (String part : parts) {
            // 4. Проверка, что элемент — это 0 или 1
            if (!part.equals("0") && !part.equals("1")) {
                System.out.println("Ошибка: недопустимое значение '" + part + "'. Разрешены только 0 и 1.");
                return;
            }
            if (part.equals("1")) {
                employees++;
            }
        }

        System.out.println("Сотрудников зашло: " + employees);
    }
}