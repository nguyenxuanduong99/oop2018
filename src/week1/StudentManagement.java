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
        int i,j;
        int k = this.students.length;
        for (i = 0; i < k; i++) {
            if (this.students[i].getID().equals(id)) {
                break;
            }
        }
        for (j = i; j < k-1; j++) {
            this.students[j] = this.students[j + 1];
        }
        
    }

    public static void main(String[] args) {
        // TODO:
        
        Student s = new Student();

        Student a = new Student();
        a.setName("Nguyen Xuan Duong");
        a.setID("17020658");
        a.setGroup("INT22042");
        a.setEmail("nguyenduonguet62@gmail.com");
        System.out.println(a.getInfo());

        Student c = new Student();
        c.setName("Le Van Trung");
        c.setID("17020838");
        c.setGroup("INT22042");
        c.setEmail("TrungTrau@gmail.com");
        System.out.println(c.getInfo());

        Student e = new Student();
        e.setName("Pham Thi Quynh Trang");
        e.setID("17020938");
        e.setGroup("INT22042");
        e.setEmail("Nimmike@gmail.com");
        System.out.println(e.getInfo());
        
        System.out.println(sameGroup(a,c));
        System.out.println(sameGroup(e,c));
        removeStudent("17020838");
}
