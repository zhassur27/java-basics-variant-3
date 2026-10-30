import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Создаем массив ровно на 5 покупок
        double[] purchases = new double[5];
        double totalSum = 0;
        
        System.out.println("Введите суммы 5 последних покупок:");
        
        // 1. Цикл для ввода покупок и подсчета общей суммы
        for (int i = 0; i < purchases.length; i++) {
            System.out.print("Покупка " + (i + 1) + ": ");
            purchases[i] = scanner.nextDouble();
            totalSum = totalSum + purchases[i]; // Складываем в общую копилку
        }
        
        // 2. Рассчитываем процент кэшбека с помощью if-else
        double cashbackPercent = 0;
        
        if (totalSum > 5000) {
            cashbackPercent = 0.10; // 10%
        } else if (totalSum > 2000) {
            cashbackPercent = 0.05; // 5%
        } else {
            cashbackPercent = 0;    // 0%
        }
        
        // 3. Считаем итоговую сумму бонусов
        double bonusSum = totalSum * cashbackPercent;
        
        // 4. Выводим результат на экран
        System.out.println("Общая сумма покупок: " + totalSum + " руб.");
        System.out.println("Ваш кэшбек составляет: " + bonusSum + " руб.");
        
        scanner.close();
    }
}
