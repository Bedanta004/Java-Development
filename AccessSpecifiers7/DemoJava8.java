class Laptop{
    String model;
    int price;

    public String toString(){
        return model + " : " + price;
    }
}
// We can't create object of abstract class
abstract class Car{
    // abstract method belongs to abstract class only
    // Declaring a method, not defining
    // Abstract keyword
    public abstract void drive();
    public abstract void fly();

    public void playMusic(){
        System.out.println("Play Music");
    }
}
class WagonR extends Car{
    // Defining drive here
    public void drive(){
        System.out.println("Driving a car");
    }

    public void fly(){
        System.out.println("Flying a car");
    }
}

class A{
    // variable in a class
    int age;

    // Method in a class
    public void show(){
        System.out.println("In a show of class A");
    }

    // class inside a class
    // B is not openly available, a part of A
    static class B{
        // static can be used only for the inner class
        public void config(){
            System.out.println("In a config of class B");
        }
    }
}
public class DemoJava8{
    public static void main(String[] a){
        Laptop obj1 = new Laptop();
        obj1.model = "Lenovo Yoga";
        obj1.price = 100000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenovo Yoga";
        obj2.price = 100000;

        boolean result = obj1.equals(obj2);

        System.out.println(obj1);
        System.out.println(result);


        int num = 56;
        // Autoboxing
        Integer num1 = num;

        int num2 = num1; //Auto-Unboxing
        System.out.println(num2);


        // We can't create object of abstract class
        // Car is a abstract class but WagonR is not

        Car obj = new WagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();

        System.out.println(" ");

        // Accessing class A & B
        A obj3 = new A();
        obj3.show();

        // calling class B
        // from the object of class A
        // If the class is not static

        // A.B obj4 = obj3.new B();
        // obj4.config();

        // If the class is static
        
    }
}