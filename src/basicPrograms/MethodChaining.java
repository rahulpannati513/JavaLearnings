public class MethodChaining {
    int a,b;
    MethodChaining setValue(int x,int y){
        a =x;
        b =y;
        return this;
    }
    MethodChaining display(){
        System.out.println("a value is : "+a);
        System.out.println("b value is : "+b);
        return this;
    }


}
class MethodChainingDemo{
    public static void main(String[] args) {
        MethodChaining m1 = new MethodChaining();
        m1.setValue(10,20).display().setValue(11,22).display();
    }
}
//public class MethodChaining {
//    int a, b;
//
//    MethodChaining setValue(int x, int y) {
//        a = x;
//        b = y;
//        return this;
//    }
//
//    MethodChaining display() {
//        System.out.println("a value is : " + a);
//        System.out.println("b value is : " + b);
//        return this;
//    }
//}
//
//class MethodChainingDemo {
//    public static void main(String[] args) {
//        MethodChaining m1 = new MethodChaining();
//        m1.setValue(10, 20).display().setValue(11, 22).display();
//    }
//}
