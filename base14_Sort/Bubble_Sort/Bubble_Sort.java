/*
@File    :   Bubble_Sort.java
@Time    :   2020/08/06 12:03:01
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   冒泡排序
*/

package base14_Sort.Bubble_Sort;

public class Bubble_Sort {
    public static void main(String[] args) {
        int data[] = {2,3,5,8,4,5,6,7,0,2};
        data = bubbleSort(data);
        for (int i : data) {
            System.out.print(i);
        }
    }
    public static int[] bubbleSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }
}