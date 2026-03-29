
// I can create my own Exception class
//Just we have to inherit it from Exception class 
// My own exception
 
class SonuException extends Exception{
    public SonuException(String str){}
}

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class ExceptionHandle11{
    public static void main(String args[]){

        try{
            Class.forName("Demo");
        }
        catch(ClassNotFoundException e){
            System.out.println("Not able to find the class "+ e);
        }

        int i = 20;
        int j = 0;

        int nums[] = new int[5];

        // try{
        //     j = 18/i;
        //     System.out.println(nums[1]);
        //     System.out.println(nums[5]);
        // }

        try{
            j = 18/i;
            if(j == 0){
                throw new SonuException("I don't want to print zero ");
            }
        }

        // catch only executes in case of exception, otherwise skipped
        catch(SonuException e){
            System.out.println("Denominator can't be zero");
        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Stay in your limit");
        }

        catch(Exception e){
            System.out.println("Something went wrong " + e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }
}