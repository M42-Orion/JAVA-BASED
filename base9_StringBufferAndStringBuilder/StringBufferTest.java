/*
@File    :   StringBufferTest.java
@Time    :   2020/07/27 11:57:31
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package base9_StringBufferAndStringBuilder;

public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println("sb:" + sb);
        System.out.println("sb.capacity():" + sb.capacity());
        System.out.println("sb.length():" + sb.length());
        System.out.println("--------------------------------");
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println("sb2:" + sb2);
        System.out.println("sb2.capacity():" + sb2.capacity());
        System.out.println("sb2.length():" + sb2.length());
        System.out.println("--------------------------------");
        StringBuffer sb3 = new StringBuffer("hello");
        System.out.println("sb3:" + sb3);
        System.out.println("sb3.capacity():" + sb3.capacity());
        System.out.println("sb3.length():" + sb3.length());

    }
}