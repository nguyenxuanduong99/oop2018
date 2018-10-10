package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
public class HoaQua {
    private String ten;
    private int can;
    private String Nguongoc;

    public String getTen() {
        return this.ten;
    }
    public void setTen(String ds)
    {
        this.ten=ds;
    }
    public int getCan()
    {
        return this.can;
    }
    public void setCan(int ds)
    {
        this.can=ds;
    }

    public String getNguongoc() {
        return this.Nguongoc;
    }

    public void setNguongoc(String nguongoc) {
        this.Nguongoc() = nguongoc;
    }
    public void PrintOrigin()
    {
        System.out.println("Origin is " +this.Nguongoc);
    }
}
