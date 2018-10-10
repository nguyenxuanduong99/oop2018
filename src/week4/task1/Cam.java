package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */

    public class  Cam extends HoaQua {
    // Todo: Khai báo thuộc tính
    private String vi;
    private String Ngaynhap;
    //Todo: Khai báo phương thức
    public  String getVi()
    {
        return this.vi;
    }
    public  void setXuatxu(String xuatxu)
    {
        this.vi= xuatxu;
    }
    public String getNgaynhap()
    {
        return  this.Ngaynhap;
    }
    public void setNgaynhap(String ds)
    {
        this.Ngaynhap= ds;
    }
    public void PrintXuatXu()
    {
        System.out.println("Mui vi : "+getVi()+"   ");
    }
}
