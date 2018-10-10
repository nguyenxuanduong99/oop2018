package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */
    public class Tao extends HoaQua {
    // Todo: Khai báo thuộc tính
        private String Xuatxu;
        private String NgaynhapTao;
    //Todo: Khai báo phương thức
        public  String getXuatxu()
        {
            return this.Xuatxu;
        }
        public  void setXuatxu(String xuatxu)
        {
            this.Xuatxu= xuatxu;
        }
        public String getNgaynhapTao()
        {
            return  this.NgaynhapTao;
        }
        public void setNgaynhapTao(String ds)
        {
            this.NgaynhapTao= ds;
        }
        public void PrintXuatXu()
        {
            System.out.println("Xuat xu : "+getXuatxu()+"   "+getNgaynhapTao());
        }
}

