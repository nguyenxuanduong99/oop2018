//package week1;
//
//public class Student {
//
//    // TODO: khai báo các thuộc tính cho Student
//    private String name;
//    private String id;
//    private String group;
//    private String email;
//    // TODO: khai báo các phương thức getter, setter cho Student
//    public void setName(String tenSV){
//        this.name= tenSV;
//    }
//    public String getName(){
//        return name;
//    }
//
//    public void setID(String maSV){
//        this.id = maSV;
//    }
//    public String getID(){
//        return id;
//    }
//
//    public void setGroup(String Group){
//        this.group = Group;
//    }
//    public String getGroup(){
//        return group;
//    }
//
//    public void setEmail(String Email) {
//        this.email = Email;
//    }
//    public String getEmail(){
//        return email;
//    }
//
//     * Constructor 1
//     */
//    Student() {
//        // TODO:
//        this.name = "Student";
//        this.id = "000";
//        this.group = "INT22041";
//        this.email = "uet@vnu.edu.vn";
//    }
//
//    /**
//     * Constructor 2
//     * @param n
//     * @param sid
//     * @param em
//     */
//    Student(String n, String sid, String em) {
//        // TODO:
//        this.name = n;
//        this.id = sid;
//        this.group = "INT22041";
//        this.email = em;
//    }
//
//    /**
//     * Constructor 3
//     * @param s
//     */
//    Student(Student s) {
//        // TODO:
//        this.name = s.getName();
//        this.id = s.getID();
//        this.group = s.getGroup();
//        this.email = s.getEmail();
//    }
//
//    String getInfo() {
//        // TODO:
//        return this.getName()+" "+this.getID()+" "+this.getGroup()+" "+this.getEmail();
//
//    }
//}
