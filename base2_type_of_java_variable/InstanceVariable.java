/*
@File    :   InstanceVariable.java
@Time    :   2020/07/21 16:47:30
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   实例变量声明在一个类中，但在方法、构造方法和语句块之外；
*/
package base2_type_of_java_variable;

public class InstanceVariable {
    //这两个是实例变量
    public String name;//公共变量，对子类可见
    private double salary;//私有变量，仅在该类可见
    public InstanceVariable (String empName){
        name = empName;//在构造器中对name赋值
    }
    public void setSalary(double empSal){
        salary = empSal;//设定salary的值
    }  
    public void printEmp(){
        System.out.println("名字 : " + name );
        System.out.println("薪水 : " + salary);
    }
    
    public static void main(String[] args){
        InstanceVariable Tom = new InstanceVariable("Tom");
        Tom.setSalary(9999);
        Tom.printEmp();
    }
}