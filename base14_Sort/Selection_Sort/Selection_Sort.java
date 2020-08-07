/*
@File    :   Selection_Sort.java
@Time    :   2020/08/07 10:44:22
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   选择排序
*/

package base14_Sort.Selection_Sort;

public class Selection_Sort {
    public static void main(String[] args) {
        int data[] = { 2, 3, 5, 8, 4, 5, 6, 7, 0, 2 };
        data = selectionSort(data);
        for (int i : data) {
            System.out.print(i);
        }
    }

    public static int[] selectionSort(int[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minIndex]) // 找到最小的数
                    minIndex = j; // 将最小数的索引保存
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }
}