/*
@File    :   WhileTest.java
@Time    :   2020/07/22 11:01:09
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   while循环
*/

package base4_cycle;

public class WhileTest {
    public static void main(String[] args) {
        int x = 10;
        while (x < 20) {
        System.out.print("value of x:" + x);
        x++;
        System.out.print('\n');
        }
        System.out.println("---------------------");
        while (true) {
            if (x >30) {
                break;
            }
            System.out.println("value of x:" + x);
            x++;
        }
    }
}