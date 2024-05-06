// Домашняя работа №2 "Переменные"
public class Main {
    public static void main(String[] args) {


        System.out.println("Задача 1");
        System.out.println("*** Инициализация ***");

        // Инициализация переменных значениями
        var dog = 8.0; // Вероятно тип double. Если был бы без нуля, очевидно, integer
                       // но это не точно
        var cat = 3.6;
        var paper = 763789;

        // Вывод значений в строку для излишних понтов
        System.out.println("Собака (dog) = " + dog + ", Кошка (cat) = " +
                cat + ", Бумага (paper) = " + paper);


        System.out.println("Задача 2");
        System.out.println("*** Прибавление +4 ***");

        dog = dog + 4;  // можно dog += 4; в соответствии с описанием в ссылке
                        // https://www.tune-it.ru/web/vnik/home/-/blogs/java-i-var
                        // но рисковать не будем - вдруг побьют)

        cat = cat + 4;
        paper = paper + 4;


        // Проверяем результат задачи 2
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Задача 3");
        System.out.println("*** Вычитание ***");

        dog = dog - 3.5; // dog -= 3.5;
        cat = cat - 1.6; // cat -= 1.6;
        paper = paper - 7639; // paper -= 7639;

        // Проверяем результат задачи 3
        System.out.println("dog = " + dog);
        System.out.println("cat = " + cat);
        System.out.println("paper = " + paper);

        System.out.println("Задача 4");
        System.out.println("*** Трансформация друга ***");

        var friend = 19;

        System.out.println("1. friend = " + friend);

        friend = friend + 2; // по условиям задачи мы не можем инициализировать переменную выражением,
                             // будем выводить все в консоль последовательно!

        System.out.println("2. friend = " + friend);

        friend = friend / 7;

        System.out.println("3. friend = " + friend);


        System.out.println("Задача 5");
        System.out.println("*** Лягушачьи лапки ***");

        var frog = 3.5;

        System.out.println("1. frog = " + frog);

        frog = frog * 10;

        System.out.println("2. frog = " + frog);

        frog = frog / 3.5;

        System.out.println("3. frog = " + frog);

        frog = frog + 4;

        System.out.println("4. frog = " + frog);

        System.out.println("Задача 6");
        System.out.println("*** Кто кого? ***");

        var fighterOne = 78.2;
        var fighterTwo = 82.7;

        var fightersMass = fighterOne + fighterTwo;

        // выведем подробные результаты масс бойцов
        System.out.println("Масса одного бойца = " + fighterOne + ", масса второго = " + fighterTwo);
        System.out.println("Суммарная масса бойцов: " + fightersMass);

        System.out.println("Задача 7");
        System.out.println("*** Остаток от деления ***");

        var fightersDivider = fighterTwo % fighterOne; // большее делим на меньшее, как на уроке

        System.out.println("Остаток от деления масс: " + fightersDivider);

        System.out.println("Задача 8");
        System.out.println("*** Школьные воспоминания ***");

        var companyHours = 640; // она все таки нам пригодится ;)
        var companyPersonal = companyHours / 8;

        System.out.println("Всего работников в компании - " + companyPersonal + " человек");

        companyPersonal = companyPersonal + 94;
        companyHours = companyPersonal * 8;

        // вывод результата
        System.out.println("Если в компании работает " + companyPersonal + " человек, то всего " + companyHours +
                " часов работы может быть поделено между сотрудниками");


        // THE END - плюсы есть, вспомнили математику


    }
}