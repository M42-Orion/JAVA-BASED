# Java Character类

使用字符时，我们通常使用的是内置数据类型char。
```java
char ch = 'a';
// Unicode表示大写希腊字母omega
char uniChar = '&#937;'; 
// 字符数组
char[] charArray ={ 'a', 'b', 'c', 'd', 'e' }; 
``` 

在实际开发过程中，我们经常会遇到需要使用对象，而不是内置数据类型的情况。为了解决这个问题，Java语言为内置数据类型char提供了包装类Character类。
```java
Character ch = new Character('a');
``` 

## 转义序列
前面有反斜杠（\）的字符代表转义字符，它对编译器来说是有特殊含义的。 
转义序列 | 描述
--- | ---
\t | 在文中该处插入一个tab键
\b | 在文中该处插入一个后退键
\n | 在文中该处换行
\r | 在文中该处插入回车
\f | 在文中该处插入换页符
\' | 在文中该处插入单引号
\" | 在文中该处插入双引号
\\\ | 在文中该处插入反斜杠 

当打印语句遇到一个转义序列时，编译器可以正确地对其进行解释。
```java
public class Test {

   public static void main(String args[]) {
      System.out.println("She said \"Hello!\" to me.");
   }
}
``` 
## Character 方法


序号 | 方法|描述
--- | --- | ---
1 | isLetter() | 是否是一个字母
2 | isDigit() | 是否是一个数字字符
3 | isWhitespace() | 是否一个空格
4 | isUpperCase() | 是否是大写字母
5 | isLowerCase() | 是否是小写字母
6 | toUpperCase() | 指定字母的大写形式
7 | toLowerCase() | 指定字母的小写形式
8 | toString() | 返回字符的字符串形式，字符串的长度仅为1