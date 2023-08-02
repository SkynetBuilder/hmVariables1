public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog + " " + cat + " " + paper);

        System.out.println("Задача 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog + " " + cat + " " + paper);

        System.out.println("Задача 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog + " " + cat + " " + paper);
    }

    public static void task2(){
        System.out.println("Задача 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task3(){
        System.out.println("Задача 6");
        var boxerOne = 78.2;
        var boxerTwo = 82.7;
        var boxersWeight = boxerOne + boxerTwo;
        System.out.println("Общий вес бойцов составляет "+ boxersWeight + "кг");
        var boxersWeightDifference = boxerTwo - boxerOne;
        System.out.println("Разница в весе бойцов составляет "+ boxersWeightDifference + "кг");

        System.out.println("Задача 7");
        //Простое вычитание выполнено в Задаче 6, строка 53, не дублирую//
        System.out.println("Разница в весе бойцов составляет "+ boxersWeightDifference + "кг");
        boxersWeightDifference = boxerTwo % boxerOne;
        System.out.println("Разница в весе бойцов составляет "+ boxersWeightDifference + "кг");

        System.out.println("Задача 8");
        var allWorkingHours = 640;
        var employeeWorkingHours = 8;
        var emploees = allWorkingHours / employeeWorkingHours;
        System.out.println("Всего работников в компании — " + emploees + " человек");
        emploees = emploees + 94;
        allWorkingHours = employeeWorkingHours * emploees;
        System.out.println("Если в компании работает "+ emploees + " человек, то всего " + allWorkingHours +" часов работы может быть поделено между сотрудниками");
    }
}