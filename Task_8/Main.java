//8.	Вывести положительные элементы массива, а на следующей строке – отрицательные
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[]{2, -4, 3, 6, 17, 25, 49, 100500, -457, 321, 678};
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] > 0) {
                System.out.print((" " + myArray[i]));

            }
        }
        System.out.println("\n");
        for (int j = 0; j < myArray.length; j++) {
            if (myArray[j] < 0) {
                System.out.print((" " + myArray[j]));

            }

        }
    }

}
