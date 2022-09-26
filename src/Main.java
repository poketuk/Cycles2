public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int part = 15_000;
        int total = 0;
        int totalAmount = 2_459_000;
        int month = 1;
        while (total < totalAmount) {
            total = total + part;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }

        // Задание 2
        System.out.println("Задание 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Задание 3
        System.out.println("Задание 3");
        int population = 12_000_000;
        float birthRate = (float) 17 / 1000;
        float deathRate = (float) 8 / 1000;
        for (int year = 1; year < 11; year++) {
            population = population + Math.round(population * birthRate) - Math.round(population * deathRate);
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
    }
}