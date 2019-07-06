package com.yunxi.yunxiruleengine.binaryinsert;

import java.util.Arrays;
import java.util.Random;

/**
 * @Author: 无双老师【云析学院】
 * @Date: 2019-07-06 09:40
 * @Description: 二分插入排序，改进插入直接插入排序
 *
 * 在新元素插入到已序数组时，用二分法查找插入的位置
 * 最好情况：每次插入的位置k都是已序数组的最后的位置，则无需再执行移位赋值操作 O(n*log2n)
 * 最坏情况：每次插入的位置k都是已序数组的最前的位置，则整个已序数组需要移位赋值 O(n^2)
 * 空间复杂度 O(1) * 稳定性 稳定
 * 二分查找时间复杂度 O(log2n)
 */
public class BinaryInsertion {
    public static void main(String[] args) {
        int size = 20;
        int[] a = new int[size];
        // 随机数组
        for (int i = 0; i < a.length; i++) {
            Random rd = new Random();
            a[i] = rd.nextInt(100);
        }
        System.out.println("生成的随机数组 : ");
        System.out.println(Arrays.toString(a));
        System.out.println();
        System.out.println("二分插入排序后 :");
        // 插入排序
        // 外循环规定从第二个元素开始，将元素插入到已排好的数组中
        for (int i = 1; i < a.length; i++) {
            // 得到插入的位置
            int k = findByBinary(a, i);
            // 保存a[i]
            int key = a[i];
            // 元素后移
            for (int j = i - 1; j >= k; j--) {
                a[j + 1] = a[j];
            }
            // 插入新的元素
            a[k] = key;
        }
        System.out.println(Arrays.toString(a));
    }

    /**
     * 二分查找
     *
     * @param array
     * @param index
     * @return
     */
    public static int findByBinary(int[] array, int index) {
        int highIndex = index - 1;
        int lowIndex = 0;
        int middle;
        while (lowIndex <= highIndex) {
            middle = (highIndex + lowIndex) / 2;
            if (array[index] >= array[middle]) {
                // 在[lowIndex,highIndex]后半部分再折半
                // 若相等，保证新元素插在旧元素后面
                lowIndex = middle + 1;
            } else {
                // 在[lowIndex,highIndex]前半部分再折半
                highIndex = middle - 1;
            }
        }
        return lowIndex;
    }
}