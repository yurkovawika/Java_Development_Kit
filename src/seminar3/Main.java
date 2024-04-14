package seminar3;

import seminar3.task1.MyCollection;
import seminar3.task2.Calculator;
import seminar3.task4.Pair;
import static seminar3.task3.ArrayComparator.compareArrays;

public class Main {
    public static void main(String[] args){
        //task1
        System.out.println("Задание 1");
        MyCollection<Integer> myCollection = new MyCollection<>();
        myCollection.addElement(1);
        myCollection.addElement(3);
        myCollection.addElement(5);
        myCollection.addElement(7);
        myCollection.addElement(10);
        myCollection.addElement(1);
        myCollection.addElement(3);
        myCollection.addElement(5);
        myCollection.addElement(7);
        myCollection.addElement(10);
        myCollection.hasNext();
        System.out.println(myCollection);
        //task2
        System.out.println("\nЗадание 2");
        Number result;
        result = Calculator.sum(10, 5.5f);
        System.out.printf("10 + 5.5 = %s \n", result.floatValue());
        Number result1 = Calculator.divide(result, 10L);
        System.out.printf("15.5 / 10L = %s \n", result1.doubleValue());
        result = Calculator.multiply((byte) 1, (short) 64);
        System.out.printf(" 1 *  64 = %s \n", result.intValue());
        result = Calculator.subtract((short) 42, 10.4321);
        System.out.printf(" 42 -  10.4321 = %s \n", result.doubleValue());
        //task3
        System.out.println("\nЗадание 3");

        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 4, 4, 5};
        Integer[] intArray3 = {1, 2, 3, 4, 5};

        String[] strArray1 = {"Дима", "Вова", "Саша"};
        String[] strArray2 = {"Петя", "Катя", "Маша"};
        String[] strArray3 = {"Петя", "Катя", "Маша"};


        System.out.println(compareArrays(intArray1, intArray2));
        System.out.println( compareArrays(strArray1, strArray2));
        System.out.println(compareArrays(intArray1, intArray3));
        System.out.println( compareArrays(strArray1, strArray3));
        System.out.println( compareArrays(strArray2, strArray3));


        //task4
        System.out.println("\nЗадание 4");
        Pair<Integer, String> pair1 = new Pair<>(10, "кг");
        Pair<Double, Boolean> pair2 = new Pair<>(2.22, true);
        System.out.println("Pair 1: " + pair1);
        System.out.println("First Pair 2: " + pair2.getFirst());
        System.out.println("Second Pair 2: " + pair2.getSecond());
    }

}
