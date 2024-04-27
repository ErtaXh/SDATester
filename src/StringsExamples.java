public class StringsExamples {

    public static void main(String[] args) {
        String myVar = new String("Hello world!");
        System.out.println("Your string is " + myVar.length() + " character(s) long.");
        System.out.println(myVar.isEmpty());
        System.out.println(myVar.toLowerCase());
        System.out.println(myVar.toUpperCase());
        System.out.println(myVar.contains("wor"));
        System.out.println(myVar.indexOf("wor"));
        System.out.println(myVar.lastIndexOf("wor"));
        System.out.println(myVar.substring(13));
        System.out.println(myVar.substring(13, 16));

        String str = "Hello world! What a world.";
        System.out.println(myVar.equals(str));
        System.out.println(myVar == str);

        String[] elements = myVar.split(" ");
        System.out.println(elements[0]);
        System.out.println(elements[1]);


        String myVar2 = new String("H.e.l.l.o world!");
        System.out.println(myVar2.replace('.', '-'));

        myVar2 = new String("H.e...l.l...o world!");
        System.out.println(myVar2.replace("...", "->"));

        System.out.println(myVar.concat(" We meet again..."));
    }
}
