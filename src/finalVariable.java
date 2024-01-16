//public class finalVariable {
//    // The class level or local level or method level variable that has final in its definition then it is called final variable
//    // Rule:Once it is initialized by developer it values cannot e changed if we try to change its value it leads to Compile time Error.
//    static int a =10;
//    static final  int b = 20;//final static variable
//    int x2 = 30;// normal non-static variable
//    final int x=40;//final non-static
//
//    public static void main(String[] args) {
//        int p =50;//local varialbe
//        final int q = 60;//final local vairalbe
//       // q=70;//ERROR: variable x is already defined in class finalVariable
//        transientVariables h3 = new transientVariables();
//        System.out.println("tasient variable : "+x);
//        System.out.println("tasient variable : "+y);
//    }
//    class transientVariables{
//        //The class level varialbe that has transient in keyword in its defination is called transient variable
//        //Rule:
//        //Local variable cannot be declared as transient.
//        static transient int x = 10;
//        transient int y = 20;
//    }
//    //Note: We declare variable as transient to tell to jvm that we do not want ot share variable value in a file in object serialization
//    class volatileVariable{
//        // The class level variable that has volatile keyword in its defination is called volatile variable
//        static volatile int x = 10;
//        volatile int y = 20;
//        //note: We declare vairable has volatile to tell to jvm that we donot want to modify variable value concurrently by multiple threads .
//        //if we declare as volatile are allowed to change its value in sequence one after one.
//    }
//
//}
