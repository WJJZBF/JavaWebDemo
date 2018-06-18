package Practice_194_iterms;

import com.alibaba.fastjson.JSON;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

;

/**
 * @author wujiaojiao
 * @create 2018-05-03 下午7:56
 **/
public class TestFile {
    public static void main(String[] args) {

//        TestFile.filePath();
//        TestFile.myFunc();
//        TestFile.subFile();
    TestFile.searchAllFile();
    }

    public static void myFunc() {
        File myFile = new File("/Users/wujiaojiao/documents/weimeng-test");
        File[] fs = myFile.listFiles();
        long max = 0;
        long min = 10000000;
        List<File> maxFile = new ArrayList<File>();
        List<File> minFile = new ArrayList<File>();

        for (File each : fs) {
            if (each.isFile()) {
                System.out.print("文件名:" + each.getName() + "    ");
                System.out.println("大小：" + each.length());
                System.out.println(" ");
                if (each.length() > max) {
                    maxFile.clear();
                    max = each.length();
                    maxFile.add(each);
                } else if (each.length() == max) {
                    maxFile.add(each);
                }
                if (each.length() < min) {
                    minFile.clear();
                    min = each.length();
                    minFile.add(each);
                } else if (each.length() == min) {
                    minFile.add(each);
                }
            }
        }
        for (File each : maxFile) {
            System.out.println("最大文件：" + max + " " + each.getName());
        }
        for (File each : minFile) {
            System.out.println("最小文件：" + min + " " + each.getName());
        }
//        System.out.println("最大文件："+max+" "+ );
//        System.out.println("最小文件："+min+" "+minFile.getName());
    }

    public static void filePath() {
        File f1 = new File(" /Folder");
        System.out.println(f1.getAbsolutePath());
        File f2 = new File("LOL.exe");
        System.out.println(f2.getAbsolutePath());
        File f3 = new File(f1, "LOL.exe");
        System.out.println(f3.getAbsolutePath());
        long time = f1.lastModified();//最后一次修改文件的时间
        new Date(time);
    }

    public static void searchAllFile() {
        File file = new File("/Users/wujiaojiao/documents/weimeng-test");
        File[] fs=file.listFiles();
        for(File each:fs){
            if (each.isDirectory()){
                inToDirector(each);
            }else{
                System.out.println(each.getPath()+"    "+each.getName());
            }
        }
    }
    public  static void inToDirector(File f){
        File[] files=f.listFiles();
        for(File each:files){
            if(each.isDirectory()){
                inToDirector(each);
            }else{
                System.out.println(each.getPath()+"    "+each.getName());
            }
        }

    }

//    public static void subFile() {
//        File myFile = new File("/Users/wujiaojiao/documents/weimeng-test");
//        List<File> list = new ArrayList<File>();
//        list.addAll(getAllFile(myFile));
//
//        for (File file : list) {
//            System.out.println(file.getAbsolutePath());
//
//        }
//    }
//
//    public static List<File> getAllFile(File file) {
//        List<File> files = new ArrayList<File>();
//        if (file.isFile()) {
//            files.add(file);
//            return files;
//        }
//        for (File each : file.listFiles()) {
//            files.addAll(getAllFile(each));
//        }
//        return files;
//    }


}
