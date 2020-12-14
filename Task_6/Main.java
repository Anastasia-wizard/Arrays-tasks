//6.	Вывести индексы четных элементов массива.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[]{2, 4, 3, 6, 17, 25, 49, 100500, 457, 321, 678};
        for (int i = 0; i < myArray.length; i++) {
           if (myArray[i] % 2 == 0 ){
                System.out.println(i);

            }
        }

    }
}
