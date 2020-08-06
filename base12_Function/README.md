# Java 方法

如何理解System.out.println(),println()是一个方法(Method)，而System是系统类(Class)，out是标准输出对象(Object)。这句话的用法是调用系统类System中的标准输出对象out中的方法println()。
## Java方法的定义 
* Java方法是语句的集合，它们在一起执行一个功能。 
* 方法是解决一类问题的步骤的有序组合 
* 方法包含于类或对象中 
* 方法在程序中被创建，在其他地方被引用
 
**示例：** 
```java
/*
修饰符 返回值类型 方法名 (参数类型 参数名){
    ...
    方法体
    ...
    return 返回值;
}
*/
``` 
* **修饰符：**修饰符，这是可选的，告诉编译器如何调用该方法。定义了该方法的访问类型。 
* **返回值类型：**方法可能会返回值。returnValueType是方法返回值的数据类型。有些方法执行所需的操作，但没有返回值。在这种情况下，returnValueType是关键字void。
* **方法名：**是方法的实际名称。方法名和参数表共同构成方法签名。
* **参数类型：**参数像是一个占位符。当方法被调用时，传递值给参数。这个值被称为实参或变量。参数列表是指方法的参数类型、顺序和参数的个数。参数是可选的，方法可以不包含任何参数。 
* **方法体：**方法体包含具体的语句，定义该方法的功能。
如：
```java
public static int age(int age){....}
``` 
参数可以多个，如：
```java
public static int age(int age, String name){....}
``` 
**注意：** 在一些其它语言中方法指过程和函数。一个返回非void类型返回值的方法称为函数；一个返回void类型返回值的方法叫做过程。

示例函数：
```java
public class TestMax {
   /** 主方法 */
   public static void main(String[] args) {
      int i = 5;
      int j = 2;
      int k = max(i, j);
      System.out.println("The maximum between " + i +
                    " and " + j + " is " + k);
   }

   /** 返回两个整数变量较大的值 */
   public static int max(int num1, int num2) {
      int result;
      if (num1 > num2)
         result = num1;
      else
         result = num2;

      return result; 
   }
}
``` 
结果如下：
```bash
The maximum between 5 and 2 is 5
``` 
## 方法重载

重载的含义在于当你完成一个函数只能针对int类型的数据做处理的时候，你的就不能操作float类型的数据，这个时候你可以使用重载方法，重新写一个方法名一样的方法，但是传入参数类型不一样的方法，当你调用方法的时候Java会自动判断这个调用属于那种方法。 

## 可变参数 

在定义方法的时候可以在传入的参数中使用省略号来实现可变参数，如：
```java
public static void printMax( double... numbers) {
   if (numbers.length == 0) {
      System.out.println("No argument passed");
      return;
    }
}
``` 


