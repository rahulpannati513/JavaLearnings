//import org.w3c.dom.ls.LSOutput;
//
//import java.sql.SQLOutput;
//
//public class thisKeyword {
//     static int x = 18;
//    static int y = 19;
//    thisKeyword(int x,int y){
//        this.x = x;
//        this.y = y;
//
//    }
//    void display(){
//        System.out.println("instance x : "+x +"\n"+"instance y : "+y);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(x+" "+y);
//
//
//        thisKeyword sb =new thisKeyword(28,29);
//        sb.display();
//        System.out.println(x+" "+y);
//
//
//    }
//
//
//}
public class thisKeyword {
    static int x = 18;
    static int y = 19;

    thisKeyword(int x, int y) {
        // Don't use "this" keyword to modify static variables
        thisKeyword.x = x;
        thisKeyword.y = y;
    }

    void display() {
        System.out.println("instance x : " + x + "\n" + "instance y : " + y);
    }

    public static void main(String[] args) {
        System.out.println(x + " " + y);

        thisKeyword sb = new thisKeyword(28, 29);
        sb.display();
        System.out.println(x + " " + y);
    }
}
