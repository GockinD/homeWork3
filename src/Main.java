public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int i = 2500;
        byte b = 100;
        short s = 1200;
        long l = 10000L;
        float f = 4.25f;
        double d = 5.248697;
        System.out.println("Значение переменной i с типом int равно " + i);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной l с типом long равно " + l);
        System.out.println("Значение переменной f с типом float равно " + f);
        System.out.println("Значение переменной d с типом double равно " + d);

        float a = 27.12f;
        long h = 987678965549L;
        float c = 2.786f;
        short j = 569;
        short e = -159;
        short w = 27897;
        byte g = 67;

        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short papers = 480;
        int paper1 = papers / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано " + paper1 + " листов бумаги");

        byte time = 2;
        byte but = 16;
        byte time1 = 20;
        byte hoursInDay = 24;
        byte minuteInHours = 60;
        int time2 = hoursInDay * minuteInHours;
        int time3 = time2 * 3;
        int time4 = time2 * 30;
        int butInTime = but / time;
        System.out.println("За 20 минут машина произвела " + (time1 * butInTime) + " штук бутылок");
        System.out.println("За сутки машина произвела " + (time2 * butInTime) + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (time3 * butInTime) + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (time4 * butInTime) + " штук бутылок");

        byte allBan = 120;
        byte whiteKlass = 2;
        byte braunKlass = 4;
        int klass = allBan / (whiteKlass + braunKlass);
        int whiteBan = klass * 2;
        int braunBan = klass * 4;
        System.out.println("В школе, где " + klass + " классов, нужно " + whiteBan + " банок белой краски и " + braunBan + " банок коричневой краски");

        byte banana = 5;
        byte bananaWheight = 80;
        byte milk = 2;
        byte milk100wheight = 105;
        byte plombir = 2;
        byte plombirWeight = 100;
        byte egs = 4;
        byte egsWeight = 70;
        int weightGramm = (banana * bananaWheight) + (milk * milk100wheight) + (plombir * plombirWeight) + (egs * egsWeight);
        float weightKg = weightGramm / 1000f;
        System.out.println("Вес завтрака " + weightGramm + " грамм или " + weightKg + " кг");

        byte wheight = 7;
        short hud1 = 250;
        short hud2 = 500;
        int day1 = (wheight * 1000) / hud1;
        int day2 = (wheight * 1000) / hud2;
        int midleDay = (day1 + day2) / 2;
        System.out.println("Если сбрасывать по " + hud1 + " грамм, то потребуется " + day1 + " дней для сброса 7 кг");
        System.out.println("Если сбрасывать по " + hud2 + " грамм, то потребуется " + day2 + " дней для сброса 7 кг");
        System.out.println("В среднем потребуется " + midleDay + " день для сброса 7 кг");

        int mashaZP = 67760;
        int denisZP = 83690;
        int kristinaZP = 76230;
        byte mont = 12;
        int mashaNewZP = (mashaZP / 10) + mashaZP;
        int denisNewZP = (denisZP / 10) + denisZP;
        int kristinaNewZP = (kristinaZP / 10) + kristinaZP;
        int yearMashaZP = (mashaNewZP * mont) - (mashaZP * mont);
        int yearDenisZP = (denisNewZP * mont) - (denisZP * mont);
        int yearKristinaZP = (kristinaNewZP * mont) - (kristinaZP * mont);
        System.out.println("Маша теперь получает " + mashaNewZP + " рублей. Годовой доход вырос на " + yearMashaZP + " рублей");
        System.out.println("Денис теперь получает " + denisNewZP + " рублей. Годовой доход вырос на " + yearDenisZP + " рублей");
        System.out.println("Кристина теперь получает " + kristinaNewZP + " рублей. Годовой доход вырос на " + yearKristinaZP + " рублей");


    }
}