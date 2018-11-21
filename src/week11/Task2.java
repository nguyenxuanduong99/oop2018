package week11;

public class Task2 {
    public<T>void swap(T[]arr,int i,int j){
        if(i!=j){
            T tmp =arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }
    public<T extends Comparable<T>> void lon_nhat(T[]arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++) {
                if (arr[j].compareTo(arr[min]) <= 0) {
                    min = j;
                }
            }
            swap(arr,i,min);
        }
        System.out.println(arr[n-1]);
    }
    public static void main(String[] abc){
        Task2 n=new Task2();
        Byte[] B={1,0};
        Integer[] I ={3,9,7,1,2,6};
        Double[] F={3.5,9.6,6.9,1.2,4.3,3.4};
        Character[] C={'a','f','b','m','c','k'};
        n.lon_nhat(B);
        n.lon_nhat(I);
        n.lon_nhat(F);
        n.lon_nhat(C);
    }
}
