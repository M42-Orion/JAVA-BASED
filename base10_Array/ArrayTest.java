/*
@File    :   ArrayTest.java
@Time    :   2020/07/28 11:21:51
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package base10_Array;

/**
 * ArrayTest
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[] myfirstarray = new int[10];
        int[] mysecondarray = {1,2,3,4,5,6,7};
        for (int i = 0; i < myfirstarray.length; i++) {
            myfirstarray[i] = i;//数组赋值
        }
        System.out.print('\n');
        for (int i : mysecondarray) {
            System.out.print(i);
        }
        System.out.print('\n');
        for (int i : test(myfirstarray)) {
            System.out.print(i);
        }
        
    }
    public static int[] test(int[] testarray){
        return testarray;
    }
}