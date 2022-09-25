public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int part = 15_000;
        int total = 0;
        int a = 1;
        while (total < 2_459_000) {
            total = total + part;
            System.out.println("Месяц " + a + ", сумма накоплений равна " + total + " рублей");
            a++;
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
        for (int c = 1; c < 11; c++) {
            population = population + Math.round(population * birthRate) - Math.round(population * deathRate);
            System.out.println("Год " + c + ", численность населения составляет " + population);
        }
    }
}