//9.	Прибавить к каждому элементу массива 10.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[]{2, -4, 3, 6, 17, 25, 49, 100500, -457, 321, 678};

        for (int i = 0; i < myArray.length; i++) {
            int b = myArray[i]+10;
            System.out.print(" " +b );


        }

    }
