/*
@File    :   SwitchTest.java
@Time    :   2020/07/22 11:04:39
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   switch语句
*/

package base5_Ifelse;

public class SwitchTest {
    public static void main(String[] args) {
        char grade = 'C';

        switch (grade) {
            case 'A':
                System.out.println("优秀");
                break;
            case 'B':
            case 'C':
                System.out.println("良好");
                break;
            case 'D':
                System.out.println("及格");
            case 'F':
                System.out.println("你需要继续努力");
                break;
            default:
                System.out.println("无效等级");
        }
        System.out.println("你的等级是 " + grade);
    }
}