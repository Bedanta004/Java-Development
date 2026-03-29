class A extends Thread{
    public void run(){
        for(int i=1; i<=100; ++i){
            System.out.println("Fas..");
        }
    }
}
class B extends Thread{
    public void run(){
        for(int i=1; i<=100; ++i){
            System.out.println("Slower..");
        }
    }
} 
// Two processes are happening simultaneously
// Not one after another
public class ThreadsJava13{
    public static void main(String args[]){
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}