# Java基础语法 

## java 基础语法 

一个Java程序可以认为是一系列对象的集合，而这些对象通过调用彼此的方法来协同工作。
* **对象**： 对象是类的一个实例，有属性与方法。
* **类**：类是一个模板，能够描述一类对象的行为和状态。 
* **方法**： 方法同函数，一个类可以有很多方法。逻辑运算、数据修改、业务变化及所有动作都是在方法中完成的。 
* **实例变量**：每个对象都有独特的实例变量，对象的状态由这些实例变量的值决定。 

Java的运行：
假设你编写了一个名为helloworld的Java文件内容为 
```java
public class helloworld {
   /* 第一个Java程序.  
    * 它将打印字符串 Hello World
    */
    public static void main(String []args) {
       System.out.println("Hello World"); // 打印 Hello World
    }
}
```
* **通用运行方式**：在文件当前目录下打开命令行或者打开命令行进入当前目录下。 
```java
C:>javac helloworld.java
C:>java helloworld
Hello world
``` 
## Java基础语法
>* **大小写敏感**：Java是大小写敏感的，这就意味着标识符Fuck与fuck是不同的。 
>* **类名**：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如:MyFirstJavaClass,如果你不这么做，也不会影响程序的运行，但是不优雅 。 
>* **方法名**：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。 
>* **源文件名**：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记Java是大小写敏感的），文件名的后缀为.java。（如果文件名和类名不相同则会导致编译错误）。
>* **主方法入口**：所有的Java 程序由public static void main(String[] args)方法开始执行。

## Java标识符
* 所有的标识符都应该以字母(A-Z或者a-z),美元符(\$)、或者下划线(_)开始 
* 首字符之后可以是任何字符的组合 
* 关键字不能用作标识符 
* 标识符是大小写敏感的 
* 合法标识符举例：age、$salary、_value、__1_value 
* 非法标识符举例：123abc、-salary

## Java修饰符
* **访问控制修饰符** : `default`, `public` , `protected`, `private` 
* **非访问控制修饰符** : `final`, `abstract`, `static`，`synchronized` , `volatile` 

## Java变量
* 局部变量 
* 类变量（静态变量） 
* 成员变量（非静态变量 

## java关键字 

 | 关键字 | 描述 | 
 |--- | ---|
 | abstract | 抽象方法，抽象类的修饰符 | 
 | assert | 断言条件是否满足 | 
 | boolean | 布尔数据类型 | 
 | break | 跳出循环或者label代码段 | 
 | byte | 8-bit 有符号数据类型 | 
 | case | switch语句的一个条件 | 
 | catch | 和try搭配捕捉异常信息 | 
 | char | 16-bit Unicode字符数据类型 | 
 | class | 定义类 | 
 | const | 未使用 | 
 | continue | 不执行循环体剩余部分 |
 | default | switch语句中的默认分支 |
 | do | 循环语句，循环体至少会执行一次 |
 | double | 64-bit双精度浮点数 |
 | else | if条件不成立时执行的分支 |
 | enum | 枚举类型 |
 | extends | 表示一个类是另一个类的子类 |
 | final | 表示一个值在初始化之后就不能再改变了表示方法不能被重写，或者一个类不能有子类 |
 | finally | 为了完成执行的代码而设计的，主要是为了程序的健壮性和完整性，无论有没有异常发生都执行代码。 | 
 | float | 32-bit单精度浮点数 | 
 | for | for循环语句 | 
 | goto | 未使用 | 
 | if | 条件语句 | 
 | implements | 表示一个类实现了接口 | 
 | import | 导入类 | 
 | instanceof | 测试一个对象是否是某个类的实例 | 
 | int | 32位整型数 | 
 | interface | 接口，一种抽象的类型，仅有方法和常量的定义 | 
 | long | 64位整型数 | 
 | native | 表示方法用非java代码实现 | 
 | new | 分配新的类实例 | 
 | package | 一系列相关类组成一个包 | 
 | private | 表示私有字段，或者方法等，只能从类内部访问 | 
 | protected | 表示字段只能通过类或者其子类访问子类或者在同一个包内的其他类 | 
 | public | 表示共有属性或者方法 | 
 | return | 方法返回值 | 
 | short | 16位数字 | 
 | static | 表示在类级别定义，所有实例共享的 | 
 | strictfp | 浮点数比较使用严格的规则 | 
 | super | 表示基类 | 
 | switch | 选择语句 | 
 | synchronized | 表示同一时间只能由一个线程访问的代码块 | 
 | this | 表示调用当前实例或者调用另一个构造函数 | 
 | throw | 抛出异常 | 
 | throws | 定义方法可能抛出的异常 | 
 | transient | 修饰不要序列化的字段 | 
 | try | 表示代码块要做异常处理或者和finally配合表示是否抛出异都执行finally中的代码 | 
 | void | 标记方法不返回任何值 | 
 | volatile | 标记字段可能会被多个线程同时访问，而不做同步 | 
 | while | while循环 | 

## Java注释
```java
//单行注释
/* 
这
是
多行
注释
！
*/
```

## java 空行
没用，不影响程序的运行
