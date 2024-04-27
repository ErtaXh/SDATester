public class OperatorsExamples {
    public static void main(String[] args) {

       //Aritmetike


        int x = 3, y = 4;
        int res = x + y;
        --x;

        int res2 = x+y;
        System.out.println("res " + res);

        System.out.println("x " + x);

        System.out.println("res2 " + res2);


        // Krahasuse

        int a = 3, b = 4;
        boolean c = a == b;

        System.out.println("c " + c);


        //Logjike

        int d = 3, e = 4;
        boolean flag = true;
        boolean result = (d != e) && (d > 0);
        boolean result2 = !flag;


        // Bitwise

        int value1 = 3, value2 = 50;
        int respond = ~value1;
        int respond1 = value1 & value2;

        //Vleredhenia

//        int x = 3, y = 4;
//        y += x;

//        int x = 3, y;
//        y = -x;


//        Precedence of Java Operators


        int arg1, arg2 = 3, arg3 = 4, arg4 = 2;
        arg1 = arg2 + arg3 - arg4;


//        int arg1, arg2, arg3 = 8; // only arg3 is 8
//        arg1 = arg2 = arg3;



    }


}
