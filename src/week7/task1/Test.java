package week7.task1;

/**
 * Created by CCNE on 31/10/2018.
 */
public class Test {
    public static void main(String[] abc){
        Numeral so = new Numeral(10);
        Numeral one = new Numeral(1);
        Numeral two = new Numeral(2);
        Numeral three = new Numeral(3);
        Square bp = new Square(so);

        Subtraction kq1 = new Subtraction(bp , one);


        Multiplication kq2 = new Multiplication(two , three);


        Addition kq3 = new Addition(kq1 , kq2);


        Square kq = new Square(kq3);
        System.out.println("Ket qua phep tinh la: "+ kq.evaluate());

        try {

            System.out.println(99/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }


    }
}
