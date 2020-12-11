//1.	Вывести массив
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 20) - 10);
            System.out.print(" " +myArray[i]);
        }
    }
}
