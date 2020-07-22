/*
@File    :   LocalVariable.java
@Time    :   2020/07/21 16:31:54
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   java局部变量，定义在Age方法当中的aga变量，智能在这个方法中发挥作用。
*/
package base2_type_of_java_variable;
public class LocalVariable {
    public void Age() {
        int age = 1998;
        age = 2020 - 1998;
        System.out.print(age);
    }
    public static void main(String[] args) {
        LocalVariable test = new LocalVariable();
        test.Age();
    }
}