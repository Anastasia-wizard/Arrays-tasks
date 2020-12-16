//11.	Заменить все элементы в массиве на противоположные.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }
        System.out.println(Arrays.toString(myArray));
        for (int j = 0; j < myArray.length; j++) {
            myArray[j] = - myArray[j];

        }
        System.out.println(Arrays.toString(myArray));
    }
}
