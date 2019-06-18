package com.cn.tools;

import java.io.*;

/**
 * git commit -m "小蒙提交代码"
 * Created by wangmeng on 2019/6/14.
 */
public class FileOp {


   public static void toCsv(String fileName, String content) {
        // 小萌萌实现 本地文件保存

        File csv = new File(fileName);
        BufferedWriter buff = null;
        if (csv.exists()) {
            try {
                csv.createNewFile();
                buff = new BufferedWriter(new FileWriter(csv));
                buff.write(content);


            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    buff.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void toExcel(String fileName) {
        return;
    }

    public static void toTxt(String fileName, String content) {
        // // 小萌萌实现 本地文件保存
        //1创建文件
        File file = new File("E:/test.txt");
        if (file.exists()) {

            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        //2 write
        //  String aa = "hello word617!";
        try {
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)));
            try {
                writer.write(content);

            } catch (IOException e) {
                e.printStackTrace();
            } finally {

                if (writer != null) {
                    try {
                        //3 close
                        writer.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return;
    }

    public static String readCsv(String fileName) {
        // 小萌萌实现 本地文件读入

StringBuffer buffer = new StringBuffer();
        try {
            BufferedReader buff = new BufferedReader(new FileReader(fileName));
            String line = "";
            while ((line = buff.readLine()) != null) {
               buffer.append(line.trim());
                buffer.append("\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return buffer.toString();
    }

    public static void readExcel(String fileName) {

    }
    public static void readPDF(String fileName) {

    }

    public static String readTxt(String fileName) {
        // 小萌萌实现 本地文件读入

        File file = new File("E:/data.txt");
        Integer re   = null;
        String line = null;
        try {
           FileReader rs = new FileReader(file);
            BufferedReader br = new BufferedReader(rs);
            try {

                while ((line = br.readLine()) != null){
                System.out.println(line);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return line;
    }

    public static void main(String[] args) {

         FileOp fileOp = new FileOp();
         fileOp.toCsv("E:/b.csv","李四" + "," + "198" + "," + "1992");
         String data = FileOp.readCsv("E:/a.csv");
        System.out.println(data);
         fileOp.toTxt("E:/test.txt","hello wang");
         fileOp.readTxt("E:/test.txt");
    }
}
