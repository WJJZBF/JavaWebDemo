package Practice_194_iterms;

import java.io.*;

;

/**
 * @author wujiaojiao
 * @create 2018-05-04 下午5:52
 **/
public class InOrOutPutString {
    public static void main(String[] args) {
//        InOrOutPutString.inPutSring();
        InOrOutPutString.outPutString();
    }

    public static void inPutSring() {
        try {
            File fs = new File("/Users/wujiaojiao/documents/weimeng-test/myFile.log");//创建基于文件的输入流
            FileInputStream fis = new FileInputStream(fs);
            // 通过此输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存
            byte[] all = new byte[(int) fs.length()];
            fis.read(all);
            for (byte each : all) {
                System.out.println(each);
                String s = String.valueOf(each);
                System.out.println(s);
            }
            fis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void outPutString() {
        try {
            File fs = new File("/Users/wujiaojiao/documents/myFilefor.log ");
            FileOutputStream outputStream = new FileOutputStream(fs);
            byte all[]={67,78};
            outputStream.write(all);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
