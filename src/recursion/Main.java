package recursion;

public class Main {
    public static void main(String[] args) {
        message();
    }
    static void message(){

        System.out.println("Hello world!");
        message1();
        System.out.println(" after the fucntion call Hello world!");
    }
    // function is calling another function
    static void message1(){

        System.out.println("Hello world!");
        message2();
        System.out.println(" after the fucntion call Hello world!");
    }
    static void message2(){

        System.out.println("Hello world!");
        message3();
        System.out.println(" after the fucntion call Hello world!");
    }
    static void message3(){

        System.out.println("Hello world!");
        message4();
        System.out.println(" after the fucntion call Hello world!");
    }
    static void message4(){

        System.out.println("Hello world!");

    }

}
