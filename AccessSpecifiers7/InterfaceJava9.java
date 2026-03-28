// In interface by default void show and void config are public abstract
// Interface is a class where by default all methods are public abstract
interface A{

    // All variables inside interface by default is final & static
    int age = 99;
    String area = "MADHYA";
    void show();
    void config();
}

interface X{
    void run();
}
// Inheritance is also valid here
interface Y extends X{
    // class to class -> extends
    // class to interface -> implements
    // interface to interface -> extends
}

// a class can implement multiple interfaces also
class B implements A, X{
    public void show(){
        System.out.println("IN a showw");
    }
    public void config(){
        System.out.println("In a config");
    }
    public void run(){
        System.out.println("RUNNNNING");
    }
}

// Need for interface
interface Computer{
    void code();
}

class Laptop implements Computer{
    public void code(){
        System.out.println("code, compile, run");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("code, compile, run, Faster...");
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code();
        // System.out.println("coding....");
    }
}

enum Status{
    // Objects of status
    Running, Failed, Pending, Success
}

public class InterfaceJava9{
    public static void main(String args[]){
        A obj;
        obj = new B();
        obj.show();
        obj.config();

        System.out.println(A.area);
        // We can't change the area name as it is final
        System.out.println(" ");

        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Developer sonu = new Developer();
        sonu.devApp(desk);

        System.out.println(" ");

        // enum
        int i=5;
        Status s = Status.Pending;
        System.out.println(s);
        System.out.println(s.ordinal());
        Status[] ss = Status.values();

        for(Status st : ss){
            System.out.println(st + " : " + st.ordinal());
        }
    }
}