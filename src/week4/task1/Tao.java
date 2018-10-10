package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
    public class Tao extends HoaQua {
    // Todo: Khai báo thuộc tính
        private String Xuatxu;
        private String Ngaynhap;
    //Todo: Khai báo phương thức
        public  String getXuatxu()
        {
            return this.Xuatxu;
        }
        public  void setXuatxu(String xuatxu)
        {
            this.Xuatxu= xuatxu;
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
            System.out.println("Xuat xu : "+getXuatxu()+"   "+getNgaynhap());
        }
}

