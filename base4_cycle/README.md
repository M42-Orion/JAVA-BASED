# Java 循环结构 - for, while 及 do...while 

顺序结构的程序语句只能被执行一次。如果您想要同样的操作执行多次,，就需要使用循环结构。

>Java中有三种主要的循环结构：
>* while循环
>* do…while循环
>* for循环

## whlie循环
```java
while( 布尔表达式 ) {
	//循环内容
}
``` 

## do while循环
```java
do {
       //代码语句
}while(布尔表达式);
``` 
**注意**：对于while语句而言，如果不满足条件，则不能进入循环。do…while循环至少会执行一次。布尔表达式在循环体的后面，所以语句块在检测布尔表达式之前已经执行了。 如果布尔表达式的值为true，则语句块一直执行，直到布尔表达式的值为false。 

## for循环
```java
for (int i = 0; i < args.length; i++) {
            //your code
        }

for (int i : number) {
            //your code
        }
``` 

## break
用于跳出循环，终止整个循环； 

## continue
用于跳出这一次循环，不会终止整个循环进行；