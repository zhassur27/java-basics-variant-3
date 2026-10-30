public class Main {
    public static void main(String[] args) {
        double[] purchases = {1200.0, 800.0, 1500.0, 300.0, 1700.0};
        double totalSum = 0;
        
        for (int i = 0; i < purchases.length; i++) {
            totalSum += purchases[i];
        }
        
        System.out.println("Общая сумма покупок: " + totalSum + " руб.");
        
        double cashbackPercent = 0;
        if (totalSum > 5000) {
            cashbackPercent = 10;
        } else if (totalSum > 2000) {
            cashbackPercent = 5;
        } else {
            cashbackPercent = 0;
        }
        
        double bonusAmount = totalSum * (cashbackPercent / 100);
        System.out.println("Процент кэшбека: " + cashbackPercent + "%");
        System.out.println("Начислено бонусов: " + bonusAmount + " руб.");
        System.out.println("Модуль успешно инициализирован в Git!");
    }}
