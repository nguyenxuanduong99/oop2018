package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
public class HoaQua {
    private String ten;
    private int can;
    private String Nguongoc;

    public String getname() {
        return this.ten;
    }
    public void setName(String ds)
    {
        this.ten=ds;
    }
    public int getamout()
    {
        return this.can;
    }
    public void setAmout(int ds)
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
