// Java follows cammel Casing type
class Human{
    private  int age;
    private String name= "Bedanta";

    // constructor
    // same name as the class name and returns nothing
    // We don't have to call constructor, then also it will be called

    public Human(){ //default constructor
        System.out.println("It is a constructor");
        age = 12;
        name = "Oil India";
    }

    // Parameterized constructor
    public Human(int a, String n){
        this.age = age;
        this.name = name;
    }

    // private can be used inside the class only
    public int getAge(){
        return age;
    }

    // Setting the data
    public void setAge(int a){
        age = a;
    }

    public String getName(){
        return name;
    }

}

class Mobile{
    // instance variables
    String brand;
    int price;
    String network;
    // static variable is sharewd by all the objects
    // if we change the variable name in main function, 
    // it will affect all the objects
    static String name;

    // Instance Method, not a static method
    public void show(){
        System.out.println(brand + " "+price +" "+name);
    }

    // static method
    public static void show1(){
        System.out.println("This is a static method");
    }
}
public class EncapsulationJava2{
    public static void main(String[] a){
        Human obj = new Human();
        // obj.age = 15;
        // obj.name = "Bedanta";

        // System.out.println(obj.name);
        // We will not get the direct acess for obj.name above

        // Human obj = new Human();
        obj.setAge(54); // setting age
        System.out.println(obj.getName());
        System.out.println(obj.getAge());

        // Every time you create an object, it will call the constructor




        Mobile obj1 = new Mobile();
        obj1.brand = "Perfect";
        obj1.price = 1249;
        obj1.name = "Smartphone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 9999;
        obj2.name = "Smartphone";

        // static variables are called with their classname, not with their object
        // Mobile.name = "new name";
        // Mobile.show(); we can't do
        Mobile.show1(); // static method

        obj1.show();
        obj2.show();
    }
}