package day_3;
/*when the super class and sub class variable or method name both are same 
     the super keyword is used only */
     class A{
        //variable 
        int a=10;
        String b="ankur";
     }
     class B extends A{
        int a=55;
        String b="ankur";
        void show(){
            System.out.println("for super class");
            System.out.println(super.a+" "+super.b);//to access the variable of super class super keyword is used
            System.out.println("for sub class");
            System.out.println(a+" "+b);
        }
     }
public class Super_keyword {
    public static void main(String[] args) {
        // no need to call class A as Class B extends A
        //if want to call only class A then only object for class is to be created
        B ref=new B();
        ref.show();
    }
}
