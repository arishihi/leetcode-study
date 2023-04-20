//只允许有一些数值型常量和方法，不允许有普通方法
//近似当作抽象类，只允许属性和抽象方法，要求比抽象类更严格
//接口：抽象方法和常量值的集合，从本质上讲，接口是一种特殊的抽象类
//定义的属性必须是public static final的，方法必须是public abstract的。所以这些修饰符可以被省略
interface It{
    int i = 20;
    //public static final int i = 20; //的缩写
    public void f();;
    //public abstract void f();
}
interface It2{
    int i = 20;
    void f();
}
abstract class A implements It2
{
    
    public void f(){
        System.out.printf("i = %d\n", i);
    }
}

class B {
    public static void main(String[] args)
    {
        A aa = new A();
        aa.f(); 
    }
    
}
