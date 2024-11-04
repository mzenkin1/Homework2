public class Main {
    public static void main(String[] args) {


        System.out.println("Домашнее задание2 урок1");

// Задача1

        System.out.println("Задача1");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

// Задача2

        System.out.println("Задача2");

        dog = dog + 2;
        System.out.println(dog);
        cat = cat + 2;
        System.out.println(cat);
        paper = paper + 2;
        System.out.println(paper);

// Задача3

        System.out.println("Задача3");

        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

// задача 4

        System.out.println("Задача4");

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

// задача 5

        System.out.println("Задача5");

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

// Задача 6

        System.out.println("Задача6");

        var boxer1 = 78.2;
        System.out.println(boxer1);
        var boxer2 = 82.7;
        System.out.println(boxer2);
        var amountBoxer = boxer1 + boxer2;
        System.out.println(amountBoxer);
        var differenceBoxer = boxer2 - boxer1;
        System.out.println(differenceBoxer);

// Задача 7

        System.out.println("Задача7");

        var differenceBoxer2 = boxer2 % boxer1;
        System.out.println(differenceBoxer2);

// Задача 8

        System.out.println("Задача8");

        var workingHours = 640;
        var employeeHours = 8;
        var employees = workingHours/employeeHours;
        System.out.println("Всего работников в компании — " + employees + " человек");

        var employeesNew = employees + 94;
        var workingHoursNew = employeesNew * employeeHours;
        System.out.println("Если в компании работает " + employeesNew + " человек, то всего " + workingHoursNew + " часов работы может быть поделено между сотрудниками");

// ДЗ-2, урок2
// Задача 1

        System.out.println("Домашнее задание2 урок2");
        System.out.println("Задача 1");

        int variable1 = 1_000_000;
        byte variable2 = 0;
        short variable3 = 1_000;
        long variable4 = 900_000_000_000L;
        float variable5 = 1.888f;
        double variable6 = 3.1415926535;

        System.out.println("Значение переменной variable1 с типом int равно " + variable1);
        System.out.println("Значение переменной variable2 с типом byte равно " + variable2);
        System.out.println("Значение переменной variable3 с типом short равно " + variable3);
        System.out.println("Значение переменной variable4 с типом long равно " + variable4);
        System.out.println("Значение переменной variable5 с типом float равно " + variable5);
        System.out.println("Значение переменной variable1 с типом double равно " + variable6);

// задача 2

        System.out.println("Задача 2");

        float variableA = 27.12f;
        long variableB = 987_678_965_549L;
        double variableC = 2.786;
        short variableD = 569;
        short variableE = -159;
        short variableF = 569;
        int variableG = 27897;
        byte variableH = 67;

// задача 3

        System.out.println("Задача 3");

        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short totalPaper = 480;
        int paperStudent = totalPaper/(teacher1 + teacher2 +teacher3);

        System.out.println("На каждого ученика рассчитано " + paperStudent + " листов бумагиpaperStudent");

// задача 4

        System.out.println("Задача 4");

        byte counterMinute = 8;
        int counter20Minute = counterMinute * 20;
        int counterDay = counterMinute * 60 * 24;
        int counter3Day = counterDay * 3;
        int counterMonth = counterDay * 30;

        System.out.println("За 20 минут машина произвела " + counter20Minute + " штук бутылок");
        System.out.println("За сутки машина произвела " + counterDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + counter3Day + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + counterMonth + " штук бутылок");

// задача 5

        System.out.println("Задача 5");

        short totalPaint = 120;
        byte paint1 = 2;  // Белая краска на 1 класс
        byte paint2 = 4;  // Коричневая краска на 1 класс
        int totalPaintClass = paint1 + paint2; // всего краски на 1 класс
        int totalClass = totalPaint / totalPaintClass;  // всего классов
        int totalPaint1 = totalClass * paint1; // всего белой краски
        int totalPaint2 = totalClass * paint2; // всего коричневой краски

        System.out.println("В школе, где " +totalClass+ " классов, нужно " +totalPaint1+ " банок белой краски и " +totalPaint2+ " банок коричневой краски");

// задача 6

        System.out.println("Задача 6");

        //вес бананов
        byte ingredient1 = 5;
        byte weightIngredient1 = 80;
        int TotalWeightIngredient1 = ingredient1 * weightIngredient1;

        //вес молока
        short ingredient2 = 200;
        float weightIngredient2 = 1.05f;
        float TotalWeightIngredient2 = ingredient2 * weightIngredient2;

        //вес Мороженое-пломбир
        byte ingredient3 = 2;
        byte weightIngredient3 = 100;
        int TotalWeightIngredient3 = ingredient3 * weightIngredient3;

        //вес яиц сырых
        byte ingredient4 = 4;
        byte weightIngredient4 = 70;
        int TotalWeightIngredient4 = ingredient4 * weightIngredient4;

        //вес завтрака
        float TotalWeightGram = TotalWeightIngredient1 + TotalWeightIngredient2 + TotalWeightIngredient3 + TotalWeightIngredient4;
        float TotalWeightKilogram = TotalWeightGram / 1000;

        System.out.println("Вес спортзавтрака " +TotalWeightGram+ " грамм");
        System.out.println("Вес спортзавтрака " +TotalWeightKilogram+ " килограмм");

//задача 7

        System.out.println("Задача 7");

        int totalWeight = 7000;
        int weightDay1 = 250;
        int weightDay2 = 500;
        int day1 = totalWeight / weightDay1;
        int day2 = totalWeight / weightDay2;
        int middleValue = (day1 + day2) / 2;

        System.out.println(day1 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм");
        System.out.println(day2 + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм");
        System.out.println(middleValue + " дней может потребоваться в среднем, чтобы добиться результата похудения.");

//задача 8

        System.out.println("Задача 8");

        int salaryWorker1 = 67760;
        int salaryWorker2 = 83690;
        int salaryWorker3 = 76230;

        float salaryAfterWorker1 = 1.1f * salaryWorker1;
        float salaryAfterWorker2 = 1.1f * salaryWorker2;
        float salaryAfterWorker3 = 1.1f * salaryWorker3;

        float salaryWorker1Year = salaryWorker1 * 12;
        float salaryWorker2Year = salaryWorker2 * 12;
        float salaryWorker3Year = salaryWorker3 * 12;

        float salaryAfterWorker1Year = salaryAfterWorker1 * 12;
        float salaryAfterWorker2Year = salaryAfterWorker2 * 12;
        float salaryAfterWorker3Year = salaryAfterWorker3 * 12;

        float differenceWorker1 = salaryAfterWorker1Year - salaryAfterWorker1;
        float differenceWorker2 = salaryAfterWorker2Year - salaryAfterWorker2;
        float differenceWorker3 = salaryAfterWorker3Year - salaryAfterWorker3;

        System.out.println("Маша теперь получает " + salaryAfterWorker1 + " рублей. Годовой доход вырос на " + differenceWorker1 + " рублей");
        System.out.println("Денис теперь получает " + salaryAfterWorker2 + " рублей. Годовой доход вырос на " + differenceWorker2 + " рублей");
        System.out.println("Кристина теперь получает " + salaryAfterWorker3 + " рублей. Годовой доход вырос на " + differenceWorker3 + " рублей");




    }

}