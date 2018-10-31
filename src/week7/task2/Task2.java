package week7.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public void test1() throws NullPointerException {
        String prt = null;
        try {
            if(prt.equals("duong")){
                System.out.println("kq giong nhau");
            }
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
    }
    public void test2() throws ArrayIndexOutOfBoundsException{
        String[] str = new String[]{"U" , "E", "T","Dai","hoc","Cong","nghe","thong","tin"};
        try {
            System.out.println(str[12]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        }
    }

    public void test3()throws ArithmeticException{
        try {
            System.out.println(62/0);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
        }
    }

    public void test4()throws ClassCastException{
        Object a = new String("a");
        try {
            System.out.println((int)a);
        }catch (ClassCastException e){
            System.out.println("ClassCastException");
        }

    }
    public void test5()throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\DELL\\IdeaProjects\\duong.txt"));
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
    public void test6()throws IOException{
        Scanner sc = new Scanner(new File("C:\\Users\\DELL\\IdeaProjects\\nguyenduong.txt"));
        while (sc.hasNextInt()){
            int a = sc.nextInt();
            System.out.println(a);
        }
    }
    public static void main(String[] abc)  {
        Task2 task2 = new Task2();
        task2.test1();
        task2.test2();
        task2.test3();
        task2.test4();

        try {
            task2.test5();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException");
        }
        try {
            task2.test6();
        } catch (IOException e) {
            System.out.println("IOException");
        }

    }
}