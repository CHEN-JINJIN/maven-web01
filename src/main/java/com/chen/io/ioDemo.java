package com.chen.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author : CHEN JINJIN
 * @create : 2023/10/9 16:43
 * @desc :  IO流
 */
public class ioDemo {
    public static void main(String[] args) throws Exception {
        //       1、 创建一个字节输入流管道与源文件连通
        InputStream is = new FileInputStream("D:\\JAVA-Study\\MP4\\ERAS理念实践之术后疼痛管理.mp4");

//        2、创建一个字节输出流管道与目标文件连通
        OutputStream os = new FileOutputStream("D:\\JAVA-Study\\MP4\\newMov.mp4");


//        3、定义一个数组，负责转移（中转站）
        byte[] buffer = new byte[1024];
        // 记录每次读取的字节数，用于最后装不满，导致数据错误
        int len;

//       4、 从源文件中读取数据，并装入数组中
        while ((len = is.read(buffer)) != -1) {
//          5、数组中的数据写入到目标文件中
            os.write(buffer, 0, len);
        }
        System.out.println("复制完成");
        os.close();
        is.close();
    }
}
