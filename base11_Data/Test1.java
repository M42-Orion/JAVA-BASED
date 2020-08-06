/*
@File    :   Test1.java
@Time    :   2020/07/30 10:43:02
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   获取当前时间到明天还有多少秒时
*/ 

package base11_Data;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test1 {
    public static void main(String[] args) {
        Calendar curDate = Calendar.getInstance();
        Calendar tommorowDate = new GregorianCalendar(curDate.get(Calendar.YEAR), curDate.get(Calendar.MONTH),curDate.get(Calendar.DATE) + 1, 0, 0, 0);
        System.out.print((int)(tommorowDate.getTimeInMillis() - curDate.getTimeInMillis())/1000);
    }
}