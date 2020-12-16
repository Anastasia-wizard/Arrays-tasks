import java.util.Arrays;
import java.util.Scanner;

// 19.	Вывести на экран максимальное и минимальное число в массиве.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }
        System.out.println(Arrays.toString(myArray));

        int indexOfMax = 0;
        int indexOfMin = 0;
        for (int i = 1; i < myArray.length; i++)
        {
            if (myArray[i] > myArray[indexOfMax])
            {
                indexOfMax = i;
            }
            else if (myArray[i] < myArray[indexOfMin])
            {
                indexOfMin = i;
            }
        }
        System.out.println("Индекс максимального числа  - "+indexOfMax +"\n"+
                "Индекс минимального числа - " + indexOfMin);

    }
}
