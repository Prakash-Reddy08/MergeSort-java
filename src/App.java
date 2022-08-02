import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100000);
        }
        System.out.println("Before:");
        printArray(numbers);

        mergeSort(numbers);

        System.out.println("After:");
        printArray(numbers);
    }

    public static void mergeSort(int[] arr) {
        
    }
    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }
}
