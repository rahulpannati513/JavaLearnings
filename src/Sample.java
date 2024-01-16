public class Sample extends Test {
    public static void main(String[] args) {
        int a = 50;
        System.out.println("a :"+a);
        Example e1 = new Example();
        System.out.println("e1 :"+e1);// it will print reference of this object e1
        System.out.println("e1.a which means in above example class there contains two varaibles which we are accessing a :"+e1.x+"\nand \nY :"+e1.y);

    }
}
