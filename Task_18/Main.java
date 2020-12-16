// 18.	Вывести на экран сколько отрицательных, и сколько положительных чисел в массиве.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }
        System.out.println(Arrays.toString(myArray));

        for (int j = 1; j < myArray.length; j++) {
            if (myArray[j] > 0) {
                System.out.print(" "+myArray[j]);
            }
        }
        System.out.println("\n");
        for (int l = 0; l < myArray.length; l++) {
            if (myArray[l] < 0) {
                System.out.print(" "+myArray[l]);
            }

        }
    }
}
