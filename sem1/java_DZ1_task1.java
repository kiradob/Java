package sem1;

import java.util.Random;

// /**
//  * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//  * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1,
//  1 на 0;


public class java_DZ1_task1 {
    public static void main(String[] args){
        replace01Array();
    }
    public static void replace01Array() {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(2);
        System.out.println("Требуется задать массив из 0 и 1 и заменить 0 на 1, 1 на 0");
        System.out.print("Входной массив:   ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
        System.out.println();
        for (int i = 0; i < array.length; i++)
            if (array[i] == 0)
                array[i] = 1;
            else
                array[i] = 0;
        System.out.print("Итоговый массив: ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + ", ");
        System.out.println();
    }
}
