import java.util.Arrays;
import java.util.Scanner;

// 16.	Вывести на экран перемножение всех чисел в массиве.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }
int mult =myArray[0];
        for (int j = 1; j < myArray.length; j++) {
            mult = mult*myArray[j];

        }


        System.out.println(mult);
    }
}
