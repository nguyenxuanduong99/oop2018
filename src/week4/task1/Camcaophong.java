package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
public class Camcaophong extends Cam{
    private  int SoLuong;
    private  String Xuatxu;
    //TOdo: Khai Báo phương thức

    public int getSoLuong() {
        return this.SoLuong;
    }

    public void setSoLuong(int soLuong) {
        this.SoLuong= soLuong;
    }

    public String getXuaxu() {
        return this.Xuatxu;
    }

    public void setXuatxu(String xuatxu) {
        this.Xuatxu=xuatxu;
    }

    public void nhap()
    {
        System.out.println("So luong can nhap" + getSoLuong());
    }
}