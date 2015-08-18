public class Extend
{
	public static void main(String args[])
	{
        	A a1 = new A();  
                A a2 = new B();  
                B b = new B();  
                C c = new C();   
                D d = new D();   
                System.out.println(a1.show(b));   //①  
                System.out.println(a1.show(c));   //②  
                System.out.println(a1.show(d));   //③  
                System.out.println(a2.show(b));   //④  
                System.out.println(a2.show(c));   //⑤  
                System.out.println(a2.show(d));   //⑥  
                System.out.println(b.show(b));    //⑦  
                System.out.println(b.show(c));    //⑧  
                System.out.println(b.show(d));    //⑨
                // System.out.println(b.getClass().getName()); 
	}
}

class A {  
         public String show(D obj){  
                return ("A and D");  
         }   
         public String show(A obj){  
                return ("A and A");  
         }   
}   
class B extends A{  
         public String show(B obj){  
                return ("B and B");  
         }  
         public String show(A obj){  
                return ("B and A");  
         }   
}  
class C extends B{}   
class D extends B{}

//输出如下：
//①   A and A
//②   A and A
//③   A and D
//④   B and A
//⑤   B and A
//⑥   A and D
//⑦   B and B
//⑧   B and B
//⑨   A and D

//④⑤和⑦⑧对比有点难懂，实现了多态，编译器会去找那个重写了父类的函数B and A而不是去调用那个在B中新的函数B and B











