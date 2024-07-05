package day_3;
// constructor is a type of method whose name is same as its class
//every class has a default constructor

class A{
    int age;
    String name;
    A(){
         age = 22;
         name ="Ankur Shrivastav";
    }
    void show(){
       
        System.out.println("your name is "+name);
        System.out.println("Your Age is "+age);
    }

}
public class constructor {
    public static void main(String[] args) {
        A ref=new A();//object for class A
        //we don't need to call constructor becouse after creating object it can be automatically call
        ref.show();

    }
}
