package week2.task3;

public class Task3 {
    class teacher {
        String name;
        int age;
        String sex;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return this.sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        public void Name() {
            System.out.println("Ho va ten" + this.name);
        }

        // TODO giao vien dang day hoc
        public void Age() {
            System.out.println("Tuoi"+ this.age);
        }

        // TODO mon hoc
        public void Sex() {
            System.out.println("Gioi tinh"+this.sex);
        }
    }
    class conmeo {
        String ten;
        int tuoi;
        String mau;
        public String getTen() {
            return this.ten;
        }

        public void setTen(String ten) {
            this.ten = ten;
        }
        public int getTuoi() {
            return this.tuoi;
        }

        public void setTuoi(String tuoi) {
            this.tuoi = tuoi;
        }
        public String getMau() {
            return this.mau;
        }

        public void setMau(String mau) {
            this.mau = mau;
        }
        public void An() {
            System.out.println("con meo thich an ca");
        }
        public void Ngu() {
            System.out.println("con meo thich ngu ngay");

        }
        public void BatChuot() {
            System.out.println("con meo bat chuot ban dem");
        }
    }
    class laptrinhvien{
        String name;
        int age;
        String sex;

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSex() {
            return this.sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }
        public void Laptrinh(){
            System.out.println("Lap trinh C++");
        }
        public void Thoigian(){
            System.out.println("Lap trinh ca ngay");
        }
        public void Choi(){
            System.out.println("Khong duoc choi");
        }
    }
}


//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
