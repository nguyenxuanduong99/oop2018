package week1;

public class StudentManagement {

    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)
    public Student[] students = new Student[100];
    
    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return s1.getGroup().equals(s2.getGroup()); 
    }

    void studentsByGroup() {
        // TODO:
        
    }

    void removeStudent(String id) {
        // TODO:

    }

    public static void main(String[] args) {
        // TODO:
        // cau 1:
        Student s = new Student();
        // cau 6:
        Student a = new Student();
        a.setName("Nguyen Xuan Duong");
        a.setID("17020658");
        a.setGroup("INT22042");
        a.setEmail("nguyenduonguet62@gmail.com");
        System.out.println(a.getInfo());
        // cau 8:
        Student b = new Student();
        Student c = new Student("Le Van Trung","17020838","TrunTrau@gmail.com");
        Student d = new Student(c);
        System.out.println(b.getInfo());
        System.out.println(c.getInfo());
        System.out.println(d.getInfo());
        // cau 10:
        StudentManagement sm = new StudentManagement();
        Student e = new Student("Pham Thi Quynh Trang","17020938","Nimmike@gmail.com");
        System.out.println(sm.sameGroup(a,c));
        System.out.println(sm.sameGroup(c,e));
        // cau 11+12+13:
        Student[] stlist = sm.students;
        for (int i=0;i<100;i++){
            stlist[i] = new Student();
        }
        // Them 3 sinh vien vao danh sach stlist
        stlist[0]=a;
        stlist[1]=c;
        stlist[2]=e;
        sm.studentsByGroup();
        System.out.println("Danh sach sinh vien sau khi xoa ID: 17020838");
        sm.removeStudent("17020838");
        for (int i=0;i<sm.students.length;i++){
            if (sm.students[i].getName()!="Student"){
                System.out.println(sm.students[i].getInfo());
            }
        }

    }
    }
}
