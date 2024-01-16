public class variables {
    // Types of variables i
    //Based on Scopelevel varaibles are divided in two types
    //1.Local level
    //2.class level variables
    // Class level variables are divided into two types based on the time they are getting memory allocation they are.
    //1.static variables: the class level variable which has static keyword in its creation statement  it is called variable, else it is called instance variables.

    //2.instance variables
    //....
    //Static variables
    static int a =10;// will get memory allocation when class is executed by JVM
    static int b = 20;
    //instance variables
    int x = 30;// will get memory allocation when object is created by using new keyword.
    int y= 40;

    public static void main(String[] args) {
        int p = 50;// local variable--> also it will be called by jvm this memory will be
        // created Destroyed when our method Execution is completed.
        int q = 60;
        System.out.println("this is  static variable a :"+a);
        System.out.println("this is  static variable b :"+b);
        System.out.println("will get memory allocation when class is executed by JVM");
        System.out.println("this is local variable p :"+p);
        System.out.println("this is local variable q :"+q);
        System.out.println(" it will be called by jvm this memory will be created Destroyed when our method Execution is completed.");

        variables h = new variables();
        System.out.println("non-static/instance variable x: "+h.x);
        System.out.println("non-static/instance variable x: "+h.y);
        System.out.println("will get memory allocation when object is created by using new keyword.");
    }
}
