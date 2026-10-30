import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] purchases = new double[5];
        double totalSum = 0;
        System.out.println("Введите суммы 5 последних покупок:");
        for (int i = 0; i < purchases.length; i++) {
            System.out.print("Покупка " + (i + 1) + ": ");
            purchases[i] = scanner.nextDouble();
            totalSum = totalSum + purchases[i];
        }
        double cashbackPercent = 0;
        if (totalSum > 5000) {
            cashbackPercent = 0.10; 
        } else if (totalSum > 2000) {
            cashbackPercent = 0.05; 
        } else {
            cashbackPercent = 0;  
        }
        
        double bonusSum = totalSum * cashbackPercent;
        System.out.println("Общая сумма покупок: " + totalSum + " руб.");
        System.out.println("Ваш кэшбек составляет: " + bonusSum + " руб.");
       
    }
}
