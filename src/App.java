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

    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }
        int midIndex = inputLength / 2;
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[inputLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = midIndex; i < inputLength; i++) {
            rightHalf[i - midIndex] = inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray, leftHalf, rightHalf);
    }
    
    public static void merge(int[] inputArray, int[] leftHalf, int[] rightHalf) {
        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;

        int i = 0; // ** is used to traverse the leftHalf array
        int j = 0; // ** is used to traverse the rightHalf array
        int k = 0; // ** is used to traverse the merged array

        while (i < leftSize && j < rightSize) {
            if (leftHalf[i] <= rightHalf[j]) {
                inputArray[k] = leftHalf[i];
                i++;
            }else{
                inputArray[k] = rightHalf[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            inputArray[k] = leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k] = rightHalf[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println("");
    }
}
