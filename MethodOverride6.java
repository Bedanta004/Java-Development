class A{
    public void show(){
        System.out.println("In AAAA showw");
    }
    public void config(){
        System.out.println("In A config");
    }
}

class B extends A{
    // Override the method of the parent class
    // show method in class B is overriding the show method of class A
    public void show(){
        System.out.println("In BBB showw1");
    }
}
public class MethodOverride6{
    public static void main(String args[]){
        B obj = new B();
        obj.show();
        obj.config();
    }
}