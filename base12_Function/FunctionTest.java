/*
@File    :   FunctionTest.java
@Time    :   2020/08/06 11:07:11
@Author  :   望 
@Version :   1.0
@Contact :   2521664384@qq.com
@Desc    :   None
*/

package base12_Function;

/**
 * FunctionTest
 */
public class FunctionTest {

    public static void main(String[] args) {
        FunctionTest1 test = new FunctionTest1(20);
        test.Compare();
        test.Compare(30, 50);
    }
}
/**
 * InnerFunctionTest1
 */
class FunctionTest1 {
    private int a;
    private int b;

    FunctionTest1(int i){
        this.a = i;
        this.b = 10;
    }

    public void Compare(){
        if (a > b){
            System.out.println("你的数字更大");
        }
        else{
            System.out.println("你的数字更小");
        }
    }
    public void Compare(int num1,int num2) {
        if (num1>num2){
            System.out.println(num1 + "更大");
        }
        else{
            System.out.println(num1+"不是最大的");
        }
    }
}