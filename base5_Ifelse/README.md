# Java 分支语句

顺序结构只能顺序执行，不能进行判断和选择，因此需要分支结构。

>Java有两种分支结构：
>* if语句
>* switch语句

## if/if..else/else if 语句
```java
if (condition) {
            //your code
        }
if (condition) {
            //your code
        } else {
            //your code
        }
if (condition) {
            //your code
        } else if(condition){
            //your code
        }
``` 

## switch语句

switch语句判断一个变量与一系列值中某个值是否相等，每个值称为一个分支。
```java
switch(expression){
    case value :
       //语句
       break; //可选
    case value :
       //语句
       break; //可选
    //你可以有任意数量的case语句
    default : //可选
       //语句
}
```