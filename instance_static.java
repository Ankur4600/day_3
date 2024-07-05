package day_3;
public class instance_static {
    //instance block cannot be called without object
    // this is the instance block it is called before constructor
    {
        System.out.println("this is instance block");
    }
    //static block :- it can be called automatically without any object
    static{
        System.out.println("this is the static block");
    }
    public static void main(String[] args) {
        /*if we run this program without creating object only static block 
        is call and to call instance block we have to create object*/
        //object to call instance block
        instance_static obj=new instance_static();
    }
}

