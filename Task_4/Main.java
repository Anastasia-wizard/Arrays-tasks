//4.	Вывести элементы массива с нечетным индексом в обратном порядке
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[]{2, 4, 3, 6, 17, 25, 49, 100500, 457, 321, 678};
        for (int i = myArray.length-1; i >=0; i--) {
            if (!((i % 2) == 0)) {
                System.out.println(myArray[i]);

            }
        }

    }
}
