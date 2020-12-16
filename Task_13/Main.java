import java.util.Arrays;
import java.util.Scanner;

//13.	Пользователь вводит число. Вывести на экран сколько чисел в массиве больше или равно этому числу.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }
        System.out.println(Arrays.toString(myArray));
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int count=0;
        for (int j = 0; j < myArray.length; j++) {
            if (a <= myArray[j])     count++;

        }

        System.out.println(count);
    }
}
