/*
@File    :   IfTest.java
@Time    :   2020/07/22 11:01:27
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   if语句
*/

package base5_Ifelse;

public class IfTest {
    public static void main(String[] args) {
        int x = 10;
        Object a = null;
        if (x < 10) {
            System.out.println(x);
        }

        System.out.println("---------------------");
        if (x > 5) {
            System.out.println(x);
        } else {
            System.out.println(x);
        }

        System.out.println("---------------------");
        if (a == null) {
            System.out.println(x);
        }
    }
}