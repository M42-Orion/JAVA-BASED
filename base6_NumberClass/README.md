# Java Number 类

一般地，当需要使用数字的时候，我们通常使用内置数据类型，如：byte、int、long、double等。然而，在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情形。为了解决这个问题，Java语言为每一个内置数据类型提供了对应的包装类。(以上是百度的内容)

* 个人理解，当你想要对数据做一些骚操作的时候，比如把数字转化为字符串的时候，自己写方法很麻烦，但是只要是number类型的时候你就能够直接使用toString()方法把数字转化为字符串类型

```java
public class Test{

   public static void main(String args[]){
      Integer x = 5; // boxes int to an Integer object
      x =  x + 10;   // unboxes the Integer to a int
      System.out.println(x); 
   }
}
```

## Java Math类
Java 的 Math 包含了用于执行基本数学运算的属性和方法，如初等指数、对数、平方根和三角函数。Math 的方法都被定义为 static 形式，通过 Math 类可以在主函数中直接调用。

```java
public class Test {  
    public static void main (String []args)  
    {  
        System.out.println("90 度的正弦值：" + Math.sin(Math.PI/2));  
        System.out.println("0度的余弦值：" + Math.cos(0));  
        System.out.println("60度的正切值：" + Math.tan(Math.PI/3));  
        System.out.println("1的反正切值： " + Math.atan(1));  
        System.out.println("π/2的角度值：" + Math.toDegrees(Math.PI/2));  
        System.out.println(Math.PI);  
    }  
}
```

## Number & Math 类方法

序号 | 方法与描述
--- | ---
1 | xxxValue()将number对象转换为xxx数据类型的值并返回。
2 | compareTo()将number对象与参数比较。
3 | equals()判断number对象是否与参数相等。
4 | valueOf()返回一个Integer对象指定的内置数据类型
5 | toString()以字符串形式返回值。
6 | parseInt()将字符串解析为int类型。
7 | abs()返回参数的绝对值。
8 | ceil()对整形变量向左取整，返回类型为double型。
9 | floor()对整型变量向右取整。返回类型为double类型。
10 | rint()返回与参数最接近的整数。返回类型为double。
11 | round()返回一个最接近的int、long型值。
12 | min()返回两个参数中的最小值。
13 | max()返回两个参数中的最大值。
14 | exp()返回自然数底数e的参数次方。
15 | log()返回参数的自然数底数的对数值。
16 | pow()返回第一个参数的第二个参数次方。
17 | sqrt()求参数的算术平方根。
18 | sin()求指定double类型参数的正弦值。
19 | cos()求指定double类型参数的余弦值。
20 | tan()求指定double类型参数的正切值。
21 | asin()求指定double类型参数的反正弦值。
22 | acos()求指定double类型参数的反余弦值。
23 | atan()求指定double类型参数的反正切值。
24 | atan2()将笛卡尔坐标转换为极坐标，并返回极坐标的角度值。
25 | toDegrees()将参数转化为角度。
26 | toRadians()将角度转换为弧度。
27 | random()返回一个随机数。