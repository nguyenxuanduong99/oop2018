package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
public class HoaQua {
    private String ten;
    private int can;
    private String goc;

    public String getTen()
    {
        return this.ten;
    }
    public void setTen(String ten)

    {

        this.ten=ten;
    }
    public int getCan()
    {

        return this.can;
    }
    public void setCan(int ds)
    {
        this.can=ds;
    }

    public String getGoc() {

        return this.goc;
    }

    public void setGoc(String goc) {
        this.goc = goc;
    }
    public void Nguongoc()
    {
        System.out.println("Nguon goc " +this.goc);
    }
}
