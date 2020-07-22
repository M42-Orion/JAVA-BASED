/*
@File    :   ForTest.java
@Time    :   2020/07/22 11:00:51
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   for循环
*/

package base4_cycle;

public class ForTest {
    public static void main(String[] args) {
        int [] number = {1,2,3,4,5,6};
        for (int i : number) {
            System.out.print(i+",");
        }
        System.out.println();
        System.out.println("---------------------");
        for (int i = 0; i < number.length; i++) {
            System.out.print(i + ",");
        }
        
    }
}