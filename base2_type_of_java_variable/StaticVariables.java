/*
@File    :   StaticVariables.java
@Time    :   2020/07/21 16:54:59
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   类变量也称为静态变量，在类中以static关键字声明，但必须在方法、构造方法和语句块之外。
*/
package base2_type_of_java_variable;

public class StaticVariables {
    // salary是静态的私有变量
    private static double salary;
    // DEPARTMENT是一个常量
    public static final String DEPARTMENT = "Development ";

    public static void main(String args[]) {
        salary = 1000;
        System.out.println(DEPARTMENT + "average salary:" + salary);
    }
}