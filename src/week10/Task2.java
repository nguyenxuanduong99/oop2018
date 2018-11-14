package week10;

import java.util.Scanner;

public class Task2 {
    private static void nhap_mang(int []A, int n) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
    }
    private static void xuat_mang(int []A, int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(A[i]+" ");
        }
    }

    private static void sap_xep_noi_bot(int []A, int n) {
        for(int i=0; i<n-1; i++) {
            for(int j=n-1; j>i; j--) {
                if(A[j]<A[j-1]) {
                    int temp = A[j];
                    A[j] = A[j-1];
                    A[j-1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int []A;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("So phan tu cua mang: ");
        n = sc.nextInt();
        A = new int[n];
        nhap_mang(A, n);
        System.out.println("Mang sau sap xep la: ");
        sap_xep_noi_bot(A, n);
        xuat_mang(A, n);
    }
}
