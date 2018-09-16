package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private string name;
    private string id;
    private string group;
    private string email;
    // TODO: khai báo các phương thức getter, setter cho Student
    public string getName(string name){return name;}       public void setName(){this.name=name;}
    public string getId(string id){return id;}           public void setId(){this.id=id;}
    public string getGroud(string group){return group;}     public void setGroud(){this.group=group;}
    public string getEmail(string email){return email;}     public void setEmail(){this.email=email;}
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
