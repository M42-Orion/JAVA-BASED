/*
@File    :   MathTest.java
@Time    :   2020/07/22 12:02:47
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   Math类
*/

package base6_NumberClass;

public class MathTest {
    public static void main(String[] args) {
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
    }
}