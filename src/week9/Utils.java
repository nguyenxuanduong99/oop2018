package week9;

import java.io.*;
import java.util.Scanner;

public class Utils {
    //Doc file
    public static void readContentFromFile(String path) throws FileNotFoundException {
        Scanner ds = new Scanner(new File(path));
        String Text;
        while (ds.hasNextLine()){
            Text = ds.nextLine();
            System.out.println(Text);
        }
        ds.close();
    }

    //Ghi file(xoa noi dng cu)
    public static void writeContentFromFile(String path) {
        try{
            String text= "Duong uet ";
            FileWriter file = new FileWriter(path);
            file.write(text);
            file.close();
        }catch(IOException e){
            System.out.println("file bi loi");
        }

    }
    //Ghi file(them vao noi dung cu)
    public static void WriteFile(String path) throws IOException {
        String text = " duong thanh ha";
        FileWriter file = new FileWriter(path,true);
        file.write(text);
        file.close();
    }
    //Tim file trong tep
    public static void findFilebyName(String folderPath,String fileName){
        File file=  new File(folderPath);
        if(file.exists()){
            if(file.isFile()){
                if(file.getName().equals(fileName)){
                    System.out.println(file.getAbsolutePath());
                }
            }
            File[] listFile = file.listFiles();
            if(listFile!=null){
                for(File f: listFile){
                    findFilebyName(f.getAbsolutePath(),fileName);
                }
            }
        }
    }
    public static void main(String[] arg) throws IOException {
        String path="C:\\Users\\AD\\IdeaProjects\\oop2018\\Duongtv99.txt";
        readContentFromFile(path);
        writeContentFromFile(path);
        readContentFromFile(path);
        WriteFile(path);
        readContentFromFile(path);
        findFilebyName("E:\\Test\\", "Duongtv99.txt");

    }
}