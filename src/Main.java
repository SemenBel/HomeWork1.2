public class Main {
    public static void main(String[] args) {
        // Задача 1
        byte candle = 5;
        short spoon = 2000;
        int fork = 1_000_000_000;
        long plate = 5_000_000_000_000_000_000L;
        float sugar = 5.765f;
        double salt = 12.938485833;
        char symbol = 37;
        boolean aLotOfPlates = plate > 2000;

        // Задача 2
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        double boxersWeight = boxerWeight1 + boxerWeight2;
        double boxersWeightDifference = boxerWeight2 - boxerWeight1;
        System.out.println("Общий вес двух бойцов " + boxersWeight + " кг");
        System.out.println("Разница между весами бойцов " + boxersWeightDifference +  " кг");

        // Задача 3
        byte bananasPieces = 5;
        byte oneBananaWeight = 80;
        short milkMilliliters = 200;
        double milkWeight100Ml = 105;
        double milkWeigh1Ml = milkWeight100Ml / 100;
        byte iceCreamPieces = 2;
        byte oneIceCreamWeight = 100;
        byte eggsPieces = 4;
        byte oneEggWeight = 70;
        double sportsBreakfastWeight = bananasPieces * oneBananaWeight + iceCreamPieces * oneIceCreamWeight + eggsPieces * oneEggWeight + milkMilliliters * milkWeigh1Ml;
        double kilogramInGram = 1000;
        double sportsBreakfastWeightInKilogram = sportsBreakfastWeight / kilogramInGram;
        System.out.println("Вес спортивного завтрака " + sportsBreakfastWeight + " грамм");
        System.out.println("Вес спортивного завтрака в кг = " + sportsBreakfastWeightInKilogram);

        // Задача 4
        short excessWeightKg = 7;
        short weightLoss1 = 250;
        short weightLoss2 = 500;
        short oneKgInGram = 1000;
        int excessWeightGram = excessWeightKg * oneKgInGram;
        int daysWeightLoss1 = excessWeightGram / weightLoss1;
        int daysWeightLoss2 = excessWeightGram / weightLoss2;
        float meanWeightLoss = (weightLoss1+weightLoss2) / 2F;
        float daysMeanWeightLoss = excessWeightGram / meanWeightLoss;
        System.out.println("Если спортсмен будет терять каждый день по 250 грамм ему потребуется " + daysWeightLoss1 + " дней");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм ему потребуется " + daysWeightLoss2 + " дней");
        System.out.println("Чтобы добиться результата похудения спортсмену может потребоваться " + daysMeanWeightLoss + " дней в среднем");

        // Задача 5
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        byte salaryPercent = 10;
        float valueSalaryPercent = 1 + 10 / 100F;
        float mashaSalaryNew = mashaSalary * valueSalaryPercent;
        float denisSalaryNew = denisSalary * valueSalaryPercent;
        float kristinaSalaryNew = kristinaSalary * valueSalaryPercent;
        int months = 12;
        int mashaSalaryYear = mashaSalary * months;
        float mashaSalaryYearNew = mashaSalaryNew * months;
        float mashaSalaryDifference = mashaSalaryYearNew - mashaSalaryYear;
        int denisSalaryYear = denisSalary * months;
        float denisSalaryYearNew = denisSalaryNew * months;
        float denisSalaryDifference = denisSalaryYearNew - denisSalaryYear;
        int kristinaSalaryYear = kristinaSalary * months;
        float kristinaSalaryYearNew = kristinaSalaryNew * months;
        float kristinaSalaryDifference = kristinaSalaryYearNew - kristinaSalaryYear;
        System.out.println("Маша теперь получает " + mashaSalaryNew + " рублей. Годовой доход вырос на " + mashaSalaryDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisSalaryNew + " рублей. Годовой доход вырос на " + denisSalaryDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryNew + " рублей. Годовой доход вырос на " + kristinaSalaryDifference + " рублей.");

    }
}