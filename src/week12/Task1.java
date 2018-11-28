package week12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Task1 {

    public static void main (String[] args){

        Person ps1 = new AlonePerson("Duong");

        Family parentFamily = new Family("Trung", "Ha");
        Family family = new Family("Tung","Thuy");
        Family family1 = new Family("Lam","Lan");
        Family family2 = new Family("Nam","Dung");
        Family family3 = new Family("Bac","Trang");
        Family family4 = new Family("Tri", "Mai");
        Person psF1 = new AlonePerson("Hai");
        Person psF2 = new AlonePerson("Hang");
        Person psF3 = new AlonePerson("Hung");
        Person psF4 = new AlonePerson("Bao");

        Family family5 = new Family("Anh","Anh");
        Person psF5 = new AlonePerson("Dat");

        family1.addChilden(psF1);
        family2.addChilden(psF2);
        family3.addChilden(psF3);
        family4.addChilden(psF4);
        family5.addChilden(psF5);
        family2.addChilden(family5);

        family.addChilden(family1);
        family.addChilden(family2);
        family.addChilden(family3);
        family.addChilden(family4);

        parentFamily.addChilden(ps1);
        parentFamily.addChilden(family);
        parentFamily.printNewGeneration();
        parentFamily.printlist();
    }
}

abstract class Person {
    public abstract void addChilden(Person person);
    public abstract Person getChild(int i);
    public abstract String getName();
    public abstract void print();
    public abstract void printAloneSoSad();
    public abstract void printFamilyHas2Son();
    public abstract void printNewGeneration();
}

class Family extends Person{
    private String husband;
    private String wife;
    public Family(String husband, String wife){
        this.husband = husband;
        this.wife = wife;
    }
    HashMap<Integer,AlonePerson> list = new HashMap<Integer,AlonePerson>();
    List<Person>  family = new ArrayList<Person>();
    int depth = 1;

    public boolean getdepth(){
        return true;
    }
    public void addChilden(Person person) {
        family.add(person);
    }
    public Person getChild(int i) {
        return family.get(i);
    }
    public String getName() {
        return husband+" "+wife;
    }
    public void print() {
        System.out.println("Ten: "+getName());
        Iterator<Person> personIterator = family.iterator();
        while(personIterator.hasNext()){
            Person person = personIterator.next();
            person.print();
        }
    }
    public void printAloneSoSad(){
        Iterator<Person> personIterator = family.iterator();
        while(personIterator.hasNext()){
            Person person = personIterator.next();
            person.printAloneSoSad();
        }
    }
    public void printFamilyHas2Son() {
        if (family.size() == 2){
            System.out.println(getName());
        }
        Iterator<Person> personIterator = family.iterator();
        while(personIterator.hasNext()){
            Person person = personIterator.next();
            person.printFamilyHas2Son();
        }
    }
    public void printNewGeneration(){
        depth++;
        Iterator<Person> personIterator = family.iterator();
        while(personIterator.hasNext()){
            Person person = personIterator.next();
            if (person instanceof AlonePerson){
                list.put(depth,(AlonePerson)person);
            }
            person.printNewGeneration();
        }
    }
    public void printlist(){
        for ( int i = 0; i < list.size(); i++){
            list.get(i);
        }
    }
}

class AlonePerson extends Person{
    String name;
    public AlonePerson(String name){
        this.name = name;
    }
    public void addChilden(Person person) {
    }
    public Person getChild(int i) {
        return null;
    }
    public String getName() {
        return name;
    }
    public void print() {
        System.out.println("Ten: "+getName());
    }
    public void printAloneSoSad() {
        print();
    }
    public void printFamilyHas2Son() {
    }
    public void printNewGeneration() {
        System.out.println(getName());
    }
}