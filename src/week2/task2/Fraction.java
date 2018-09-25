package week2.task2;

public class Fraction {

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator)
    {
        this.numerator = numerator;
    }
    public int getNumerator()
    {
        return numerator;
    }
    public void setDenominator(int denominator)
    {
        this.denominator = denominator;
    }
    public int getDenominator()
    {
        return denominator;
    }


    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        
        return null;
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        
        return null;
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        
        return null;
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        
        return null;
    }
}
