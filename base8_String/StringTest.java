/*
@File    :   StringTest.java
@Time    :   2020/07/27 11:57:23
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package base8_String;

public class StringTest {
    public static void main(String []args){
        String str = "hello";
        char c = str.charAt(0);
        System.out.println(c);

        //字符串转化为数组
        String str2 = "hello";
        char[] charArray = str2.toCharArray();

        // 字符串转大写
        String str3 = "hello";
        char[] charArray3 = str3.toCharArray();
        for(int i = 0;i < charArray3.length; i ++){
            //小写变为大写，只需要减去32即可
            charArray[i] -= 32;
        }
        System.out.println(new String(charArray3));
        System.out.println(new String(charArray3,1,2));
    }
}