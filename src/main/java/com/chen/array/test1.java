package com.chen.array;

/**
 * @author : CHEN JINJIN
 * @create : 2023/10/16 11:12
 * @desc :
 */
public class test1 {
    public static void main(String[] args) {
        // 定义数组
        int[] arr = {11,22,33,44,55};

        // 调用方法
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        // println --换行
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1){
                System.out.print(arr[i]);
            }else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.print("]");
    }
}
