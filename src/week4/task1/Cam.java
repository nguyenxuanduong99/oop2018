package week4.task1;

/**
 * Created by CCNE on 10/10/2018.
 */

    public class  Cam extends HoaQua {
    // Todo: Khai báo thuộc tính
        private String Xuatxu;
         private String NgayCam;
    //Todo: Khai báo phương thức
         public  String getXuatxu()
        {
            return this.Xuatxu;
        }
        public  void setXuatxu(String xuatxu)
        {
            this.Xuatxu= xuatxu;
        }
        public String getTypeOfCam()
        {
            return  this.NgayCam;
        }
        public void setTypeOfCam(String ds)
        {
            this.NgayCam= ds;
        }
        public void PrintXuatXu()
        {
            System.out.println("Xuat xu : "+getXuatxu());
        }
}
