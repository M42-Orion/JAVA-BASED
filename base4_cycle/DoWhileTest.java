/*
@File    :   DoWhileTest.java
@Time    :   2020/07/22 11:00:23
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   do while循环示例
*/

package base4_cycle;

public class DoWhileTest {
    public static void main(String[] args) {
        int x = 10;
        do {
            System.out.print("value of x:" +  x);
            x++;
            System.out.print("\n");
        } while (x < 20);
        System.out.println("---------------------");
        do {
            System.out.println("value of x:" +  x);
            x++;
            if (x > 30) {
                break;
            }
        } while (true);
    }
}