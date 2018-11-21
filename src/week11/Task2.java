package week11;

public class Task2 {
    public<T extends Comparable<T>> void lon_nhat(T[]arr) {
        int n=arr.length;
        T max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i].compareTo(max)> 0){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    public static void main(String[] abc){
        Task2 test=new Task2();
        Byte[] B={1,0};
        Integer[] I ={3,9,7,1,2,6};
        Double[] F={3.5,9.6,6.9,1.2,4.3,3.4};
        Character[] C={'a','f','b','m','c','k'};
        test.lon_nhat(I);
    }
}
