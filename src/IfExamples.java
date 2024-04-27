public class IfExamples {

    public static void main(String[] args) {
//IF
        int someVar = 8;
        if (someVar >= 0 && someVar < 10){ // 8 meets both conditions, so a "number" will be printed on the screen
            System.out.println("number");
        }

        // IF ELSE

        int age = 80;
        if (age > 0 && age < 18) {
            System.out.println("minor");
            System.out.println("test");
        }

        else if (age >= 18 && age < 65) {
            System.out.println("adult");
        }
        else if (age >= 65)
            System.out.println("senior");
        else
            System.out.println("incorrect age");


        }





    }

