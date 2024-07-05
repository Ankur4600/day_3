package day_3;
// constructor is a type of method whose name is same as its class
//every class has a default constructor

class A{
    int age;
    String name;
    A(){      //default constructor as it does not have any parameter
         age = 22;
         name ="Ankur Shrivastav";
    }
    void show(){
       
        System.out.println("your name is "+name);
        System.out.println("Your Age is "+age);
    }
    

}
/*parametrized constructor
              there can be more than one constructor with different parameter */
class B{
    int a,b;
    void show(){
        System.out.println("this is class B");
    }
    B(int a,int b){//constructor 1
        int c=a+b;
        System.out.println("the sum is: "+c);

    }
    B(int x, String name){// constructor 2
        System.out.println("your name is "+name);
        System.out.println("your roll no. is: "+x);
    }
}
/*copy constructor
 when we poass onject reference to the constructor the it is called copy constructor
 */
class C{
    int a;
    String b;

     C(){
        a=22;
        b="Ankur Srivastav";
        System.out.println("this the constructor of Class C");
        System.out.println(a+" "+ b);
    }
    C(C ref){
        int x=ref.a;
        String y = ref.b;
        System.out.println("this is the copy constructor of class C.");
        System.out.println(x+" "+y);
    }
}
public class constructor {
    //private constructor:-private constructor cannot be access out side of class and for this we have to use privaye keyword
    private constructor(){
        System.out.println("this is private constructor");

    }
    public static void main(String[] args) {
        
        A ref=new A();//object for class A
        //we don't need to call constructor becouse after creating object it can be automatically call
        ref.show();
        //object for different constructor o classB
        B ref_2= new B(20,45);
        B ref_3= new B(07,"Ankur Shrivatav");
        // object for class c
        C ref4= new C();//for constructor of C
        C copy =new C(ref4);//for copy constructor by passing refrence bvariable
        // private constructor of this class
        constructor private_1= new constructor();
        System.out.println(" End of this program");
    }
}
