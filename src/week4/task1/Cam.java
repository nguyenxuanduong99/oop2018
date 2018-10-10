package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */

    public class  Cam extends HoaQua {
    // Todo: Khai báo thuộc tính
        private String xuatxu;
        private String ngaynhapCam;
    //Todo: Khai báo phương thức
         public  String getXuatxu()
        {
            return this.xuatxu;
        }
        public  void setXuatxu(String xuatxu)
        {
            this.xuatxu= xuatxu;
        }
        public String getNgaynhapCam()
        {
            return  this.ngaynhapCam;
        }
        public void setTypeOfCam(String ds)
        {
            this.ngaynhapCam= ds;
        }
        public void PrintXuatXu()
        {
            System.out.println("Xuat xu : "+getXuatxu());
        }
}
