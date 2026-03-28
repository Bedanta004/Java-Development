// Functional Interface
interface A{
    void show();
}

interface B{
    int add(int i, int j);
}

// class B implements A{
//     public void show(){
//         System.out.println("In a show");
//     }
// }

// Compile time error -> spelling mistake or Uppercase Lowercase
// Runtime error -> Execution stops in between, Exceptions

public class InterfaceTypes10{
    public static void main(String args[]){
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("In a show");
        //     }
        // };
        A obj = () -> { //Lambda Expression
                System.out.println("In a show");
            };

        B obj1 = (i,j) -> i+j;
        int result = obj1.add(54, 6);

        obj.show();
        System.out.println(result);
    }
}