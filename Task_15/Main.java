// 15.	Вывести на экран среднее всех чисел в массиве.
public class Array {
    public static void main(String[] args) {
        int[] myArray = new int[50];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) Math.round((Math.random() * 20) - 10);
        }
        double sum =0;
        for (int j = 0; j < myArray.length; j++) {
            sum = sum + myArray[j];

        }
        

        System.out.println(sum/ myArray.length);
    }
}
