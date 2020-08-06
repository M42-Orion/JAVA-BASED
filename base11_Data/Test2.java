/*
@File    :   Test2.java
@Time    :   2020/07/30 10:37:32
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   传入一定格式的时间，获得该时间的年月日等
*/


package base11_Data;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test2 { 
    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime ldt = LocalDateTime.parse("2015-09-17 20:27:00", formatter);

        System.out.println("Year: " + ldt.getYear());
        System.out.println("Month: " + ldt.getMonth().getValue());
        System.out.println("DayOfMonth: " + ldt.getDayOfMonth());
    }
}