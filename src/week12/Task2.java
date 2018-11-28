package week12;

public class Task2 {
    public static void main(String[] args){
        int[] arr = {2,8,9,4,6,3,1,7};
        SortFormat dayso = new InsertionSort();
        dayso.sapxep(arr);
        System.out.print("Day so sau sap xep la: ");
        for (int i : arr){
            System.out.print(i+" ");
        }
    }
}
interface SortFormat{
    public void sapxep(int[] arr);
}
class BubbleSort implements SortFormat{
    public void sapxep(int[] arr) {
        for (int i = 0; i < arr.length ; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j+1]){
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
class InsertionSort implements SortFormat{
    public void sapxep(int[] arr) {
        for (int i = 1; i < arr.length; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
}