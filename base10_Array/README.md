# Java数组

Java数组是固定长度且类型相同的数据结构，数组涉及三个知识点：数组声明、数组创建、数组初始化

## 数组声明 
首先必须声明数组变量，才能在程序种使用数组 
```java
double[] FirstList;         // 首选的方法
//或
double FirstList[];         //  效果相同，但不是首选方法
``` 
 
## 创建数组
Java使用new来创建数组
`arrayname = new dataType[arraySize];` 
这行代码有两个操作：
> * 使用dataType[arraySize]创建了一个数组。 
> * 把新创建的数组的引用赋值给变量 arrayRefVar。

数组变量的声明，和创建数组可以用一条语句完成，如例所示：
`dataType[] arrayRefVar = new dataType[arraySize];`
这样的方法是创建并声明一个空数组，如果想要创建并声明一个有内容的数组可以这样 ：
`dataType[] arrayRefVar = {value0, value1, ..., valuek};`
和其他语言一样，数组的元素是通过索引访问的。数组索引从0开始，所以索引值从0到数组长度-1。 
实例：
```java
double[] myList_1 = new double[10];
double[] myList_2 = {1.0,2.0,3.0,4.0,5.0};
``` 

## 数组的处理 
在Java中，数组的长度是不变的，所以处理数组的时候通常使用基本循环与`foreach`循环。

### 基本循环

```java
public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // 打印所有数组元素
      for (int i = 0; i < myList.length; i++) {
          System.out.println(myList[i] + " ");
       }
       // 计算所有元素的总和
       double total = 0;
       for (int i = 0; i < myList.length; i++) {
          total += myList[i];
       }
       System.out.println("Total is " + total);
       // 查找最大元素
       double max = myList[0];
       for (int i = 1; i < myList.length; i++) {
          if (myList[i] > max) max = myList[i];
      }
      System.out.println("Max is " + max);
   }
}
``` 
### foreach循环 
这是JDK1.5引进的一种新的循环被称为加强型循环。
```java
public class TestArray {

   public static void main(String[] args) {
      double[] myList = {1.9, 2.9, 3.4, 3.5};

      // 打印所有数组元素
      for (double element: myList) {
         System.out.println(element);
      }
   }
}
``` 
除此之外，数组还能够作为参数传递给函数，也能作为返回值被函数返回回来。

## Arrays 类
java.util.Arrays类能方便地操作数组，它提供的所有方法都是静态的。具有以下功能：

* 给数组赋值：通过fill方法。
* 对数组排序：通过sort方法,按升序。
* 比较数组：通过equals方法比较数组中元素值是否相等。
* 查找数组元素：通过binarySearch方法能对排序好的数组进行二分查找法操作。 

序号 | 方法 | 说明
--- | --- | ---
1 | public static int binarySearch(Object[] a, Object key) | 用二分查找算法在给定数组中搜索给定值的对象(Byte,Int,double等)。数组在调用前必须排序好的。如果查找值包含在数组中，则返回搜索键的索引；否则返回 (-(插入点) - 1)。
2 | public static boolean equals(long[] a, long[] a2) | 如果两个指定的 long 型数组彼此相等，则返回 true。如果两个数组包含相同数量的元素，并且两个数组中的所有相应元素对都是相等的，则认为这两个数组是相等的。换句话说，如果两个数组以相同顺序包含相同的元素，则两个数组是相等的。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。
3 | public static void fill(int[] a, int val) | 将指定的 int 值分配给指定 int 型数组指定范围中的每个元素。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。
4 | public static void sort(Object[] a) | 对指定对象数组根据其元素的自然顺序进行升序排列。同样的方法适用于所有的其他基本数据类型（Byte，short，Int等）。