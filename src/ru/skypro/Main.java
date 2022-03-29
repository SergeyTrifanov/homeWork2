package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var box = 5;
        System.out.println(box);
        box = box + 2;
        System.out.println(box);
        box = box - 3;
        System.out.println(box);
        box = box * 3;
        System.out.println(box);
        box = box / 4;
        System.out.println(box);

        var liftingCapacity = 50;
        var staffWeight = 20;
        var capacityLeft = liftingCapacity - staffWeight;
        System.out.println("Еще можно положить " + capacityLeft + " кг вещей");

        var appleWeight = 2;
        var orangesWeight = 3;
        var fruitWeight = appleWeight + orangesWeight;
        System.out.println("Общий вес фруктов " + fruitWeight);

        var meatWeight = 4;
        var waterWeight = 5;
        var tomatoesWeight = 2;
        var cucumbersWeight = 2;
        var peppersWeight = 2;
        var zucchiniWeight = 2;
        var vegetablesWeight = tomatoesWeight + cucumbersWeight + peppersWeight + zucchiniWeight;
        var productsWeight = fruitWeight + vegetablesWeight + meatWeight + waterWeight;
        System.out.println("общий вес продуктов " + productsWeight + " кг!");

        var leftWeight = liftingCapacity - staffWeight - productsWeight;
        System.out.println("Места осталось " + leftWeight + " кг!");

        productsWeight = productsWeight * 2;
        System.out.println("Теперь вес продуктов " + productsWeight);

        leftWeight = liftingCapacity - staffWeight - productsWeight;
        System.out.println("теперь места осталось " + leftWeight + " Кг!");

        var overload = (staffWeight + productsWeight) % liftingCapacity;
        System.out.println("Перегруз на " + overload + " кг!");

        var productsInOneCar = productsWeight / 2;
        System.out.println("продуктов в одной машине теперь " + productsInOneCar);

        byte bananas = 100;
        System.out.println("Бананов " + bananas + " кг!");

        float sugar = 3;
        float onePortion = sugar / 4;
        System.out.println("одна порция сахара весит " + onePortion + " кг!");

        byte a = 1;
        short b = 1;
        int c = 1;
        int d = a + b + c;
        System.out.println(d);

        float g = a + 1f;
        System.out.println(g);

        System.out.println("пишу свое ДЗ!");
        System.out.println("делаю коммит и пуш");
        System.out.println("перехожу в гет хаб");
    }
}
