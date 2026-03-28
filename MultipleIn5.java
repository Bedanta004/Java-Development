class A{
    public A(){
        System.out.println("In A class");
    }
}
class B extends A{
    // default constructor
    public B(){
        System.out.println("In B class");
    }
}
// Every class in Java extends the object class
public class MultipleIn5{
    public static void main(String a[]){
        B obj = new B();
    }
}