package week11;

public class Task1 {
    public<T>void swap(T[]arr,int i,int j){
        if(i!=j){
            T tmp =arr[i];
            arr[i]=arr[j];
            arr[j]=tmp;
        }
    }
    public<T extends Comparable<T>> void sap_xep(T[]arr){
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
        for (int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] abc){
        Task1 n=new Task1();
        Byte[] B={1,0};
        Integer[] I ={3,9,7,1,2,6};
        Double[] F={3.5,9.6,6.9,1.2,4.3,3.4};
        Character[] C={'a','f','b','m','c','k'};
        n.sap_xep(B);
        n.sap_xep(I);
        n.sap_xep(F);
        n.sap_xep(C);

    }
}
