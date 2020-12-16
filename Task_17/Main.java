import java.util.Arrays;
import java.util.Scanner;

// 17.	Вывести на экран все числа, большие чем среднее чисел в массиве.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }
        int sum = 0;
        for (int j = 1; j < myArray.length; j++) {
           sum = sum+ myArray[j];
        }
        sum = -sum;
        sum= sum/ myArray.length;

        for (int l = 0; l < myArray.length; l++) {
            if (myArray[l]> sum)  {
                System.out.print(" " +myArray[l]);
            }
        }


    }
}
