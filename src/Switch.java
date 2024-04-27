public class Switch {

    public static void main(String[] args) {
        int day = 1;
        switch (day){
            case 0:
                System.out.println("?");
                break;
            case 6:
            case 7:
                System.out.println("weekend");
                break;
            case 5:
                System.out.println("friyay!");
            default:
                System.out.println("work work work ;(");
        }
    }
}
