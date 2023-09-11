
public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1");

        var dog = 8.0;
        System.out.println("Значение переменной dog: " + dog);

        var cat = 3.6;
        System.out.println("Значение переменной cat: " + cat);

        var paper = 763789;
        System.out.println("Значение переменной paper: " + paper);

        System.out.println();
        System.out.println("Задача 2");

        dog += 4;
        cat += 4;
        paper += 4;

        System.out.println("Новое значение переменной dog: " + dog);
        System.out.println("Новое значение переменной cat: " + cat);
        System.out.println("Новое значение переменной paper: " + paper);

        System.out.println();
        System.out.println("Задача 3");

        dog -= 3.5;
        cat -= 1.6;
        paper -= 7639;

        System.out.println("Значение переменной dog после уменьшения: " + dog);
        System.out.println("Значение переменной cat после уменьшения: " + cat);
        System.out.println("Значение переменной paper после уменьшения: " + paper);

        System.out.println();
        System.out.println("Задача 4");

        var friend = 19;
        System.out.println("Значение переменной friend: " + friend);
        friend += 2;
        System.out.println("Прибавим к нему 2: " + friend);
        friend /= 7;
        System.out.println("Разделим на 7: " + friend);

        System.out.println();
        System.out.println("Задача 5");

        var frog = 3.5;
        System.out.println("Значение переменной frog: " + frog);
        frog *= 10;
        System.out.println("Умножим на 10: " + frog);
        frog /= 3.5;
        System.out.println("Разделим на 3.5: " + frog);
        frog += 4;
        System.out.println("Прибавим 4: " + frog);

        System.out.println();
        System.out.println("Задача 6");

        var weightOfBoxer1 = 78.2;
        var weightOfBoxer2 = 82.7;

        var totalWeight = weightOfBoxer1 + weightOfBoxer2;
        System.out.println("Общая масса двух бойцов: " + totalWeight + " кг");

        var weightDifference = Math.abs(weightOfBoxer1 - weightOfBoxer2);
        System.out.println("Разница между массами бойцов: " + weightDifference + " кг");

        System.out.println();
        System.out.println("Задача 7");

        var weightDifference1 = weightOfBoxer2 - weightOfBoxer1;
        var weightDifference2 = Math.abs(weightOfBoxer2 % weightOfBoxer1);
        System.out.println("Разница между массами бойцов (вычитание): " + weightDifference1 + " кг");
        System.out.println("Разница между массами бойцов (остаток от деления): " + weightDifference2 + " кг");

        System.out.println();
        System.out.println("Задача 8");

        var totalHours = 640;
        var hoursPerEmployee = 8;

        var totalEmployees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании " + totalEmployees + " человек");

        var addedEmployees = 94;
        var hoursForAddedEmployees = (totalEmployees + addedEmployees) * hoursPerEmployee;
        System.out.println("Если в компании работает " + (totalEmployees + addedEmployees) + " человек, то всего " + hoursForAddedEmployees + " часов работы может быть поделено между сотрудниками");

    }
    }