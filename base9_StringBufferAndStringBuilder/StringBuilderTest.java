/*
@File    :   StringBuilderTest.java
@Time    :   2020/07/27 11:57:40
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package base9_StringBufferAndStringBuilder;

/**
 * StringBuilderTest
 */
public class StringBuilderTest {

    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("hello");
        //添加字符串
        System.out.println("str="+str.append(",").append("world!"));
        //替换字符串
        //1.先delete，后insert
        System.out.println("str="+str.delete(6, 11).insert(6,"WORLD"));
        //2.使用replece
        System.out.println("str="+str.replace(6,11,"WORLD"));
        //取出子字符串
        System.out.println("str="+str.substring(0,2));
    }
}