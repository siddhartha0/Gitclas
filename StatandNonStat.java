public class StatandNonStat {
    // // static int a = 110;
    // static String name = "Sid";

    /*
     * Static variable are declare for those which are share commonly throughout the
     * class. so that we donot have to create any object to access to it.
     */
    static int a;
    static int b;

    /*
     * static method are also created for that same purpose. To access this we donot
     * have to create any object.
     */
    public static void sum() {
        System.out.println("The sum of a and b is: " + (a + b));
    }

    public static void main(String[] args) {
        sum();
    }
}
