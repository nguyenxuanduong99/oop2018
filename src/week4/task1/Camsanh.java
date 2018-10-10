package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
public class Camsanh extends Cam {
    private  int SoLuong;
    private  String mau;
    //TOdo: Khai Báo phương thức

    public int getSoLuong() {
        return this.SoLuong;
    }

    public void setSoLuongNhap(int soLuong) {
        this.SoLuong= soLuong;
    }

    public String getMau() {
        return this.mau;
    }

    public void setXuatxu(String xuatxu) {
        this.mau=mau;
    }

    public void nhap()
    {
         System.out.println("So luong can nhap" + getSoLuong());
    }
}
