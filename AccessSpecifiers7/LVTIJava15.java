
// Allowing A class to be inherited by B & C only
sealed class A permits B,C{
}

// We have to use final or sealed keyword in class B and C
final class B extends A{}

final class C extends A{}

class D{}

// sealed interface X permits Y{

// }
// sealed interface Y extends X{

// }



class LVTIJava15{
    public static void main(String args[]){
        int a = 9;
        var b = 8;

        int c;
        // We can't initialize var without a value
        // var d;

        String var = "Sonu"; // Allowed  
        var nums = new int[10]; //Allowed
    }
}