public class Main {
    public static void main(String[] args) {
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



    }

}