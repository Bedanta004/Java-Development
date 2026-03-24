class Hello1{
    static class calculator{

        // instance variable
        int ins = 10;

        public int add(int num, int number1){
            System.out.println("calculator sum :" +" "+ (num+number1));
            return 0;
        }
        public void mult(int num, int num1){
            System.out.println("Multiplication is : " + (num*num1*ins));
        }
    }
    public static void main(String[] a){
        // System.out.print(5+34);
        int num = 7;
        byte by = 126;
        short sh = 576;
        long l = 54633l;
        float f = 5.8f;
        double d = 5.8;
        boolean b = true;

        //Binary conversion
        int bin = 0b1000;

        // Hexadecimal numbers
        int hex = 0x7E;

        //Typecsting
        int x = (int)f;

        int a1 = 257;
        byte newb = (byte)a1;
        // here the range of byte is upto 256, so it will divide 257 with 256 and output is the remainder 1

        // Type Promotion
        byte b1 = 30;
        byte b2 = 10;
        int res1 = b1*b2;
        // we will get the result as 300, while byte can't store more than 256

        // preincrement and postincrement are same as cpp
        boolean bl = b1 == b2;

        // in && operator if the 1st condition is false, it willn't check for the 2nd condition

        b1 = b1%2 == 0 ? 50 : b1;

        if(true){
            System.out.println("True Statement");
        }
        if(b1 > 30){
            System.out.println("Big Number");
        }
        else if(b1 == 30){
            System.out.println("Same Number");
        }
        else{
            System.out.print("Don't knoww");
        }

        // switch case
        int number1 = 11;
        switch(number1){
            case 1: System.out.println("Sunday");
            break;
            case 2: System.out.println("Monday");
            break;
            case 3: System.out.println("Tuesday");
            break;
            case 4: System.out.println("I don't know the exact day");
            break;
            default :
            System.out.println("It is a default case.What are you doing ??");
        }

        // for loop
        for(int i=0; i<4; ++i){
            System.out.print("This is a loop" + " ");
        }
        System.out.println(" ");

        // When we read a file from database, while loop is used

        System.out.println(bin);
        System.out.println(hex);
        System.out.println(res1);
        System.out.println(bl);


        // objected oriented
        // "calc" is a reference variable
        // Reference is created inside heap memory
        calculator calc = new calculator();
        calc.add(233252, 565743);
        System.out.println(" ");
        calc.mult(68, 2);





        // Arrays in java
        int arr[] = {1,4,89,2,4,2,1};

        // By default all values are 0
        int nums[] = new int[4];
        nums[0] = 2354;
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println(" ");

        // Matrix or 2D array
        int nums1[][] = new int[3][4];
        for(int i=0; i<3; ++i){
            for(int j=0; j<4; ++j){
                System.out.print(nums1[i][j]);
            }
        }
        System.out.println();


        // Creating a string variable or string object
        String name = new String("Bedanta");
        System.out.println(name.charAt(0)); 
        // concatination whith some other string
        System.out.println(name.concat(" Mahanty"));
        name += " Mahanty";
        System.out.println(name);

        // other way we can represent srring
        string s1 = "Nihthin";
    }
}