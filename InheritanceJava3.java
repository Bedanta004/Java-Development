class Calc{
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int sub(int n1, int n2){
        return n1-n2;
    }
}
// check AdvCal4 for the inheritance concept
// Multiple Inheritance in Java don't work
public class InheritanceJava3{
    public static void main(String[] a){
        AdvCal4 obj = new AdvCal4();

        int r1 = obj.add(4,5);
        int r2 = obj.sub(4, 5);
        int r3 = obj.mult(17, 2);
        int r4 = obj.div(500, 5);

        System.out.println(r1 + " " + r2 + " " +r3 + " " +r4);
    }
}