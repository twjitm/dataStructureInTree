package com.datastruct.nio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/**
 * Created by 文江 on 2017/11/4.
 */
public class GetChinnel {
    public static void main(String[] args) {
        try {
            FileChannel fileChannel = new FileOutputStream("").getChannel();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
