import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];

        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            arr[i] = random.nextInt(100000);
        }

        StopWatch stopWatch = new StopWatch();
        selectionSort(arr);
        stopWatch.stop();
        System.out.print("Thời gian thực hiện: " + stopWatch.getElapsedTime() + " milisecond");
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}