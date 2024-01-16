import java.util.ArrayList;

public class ConcatenationOperator {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println(5+'b');
        System.out.println((char)('a'+7));//here it is asci value of a is 97 and adding 7 to it 104 and 104 asci chacter is h
        System.out.println("a"+1);//the whole stament is considered as a string and integer 1 is treated as string therefore answer will be a1
        System.out.println("Rahul"+new ArrayList<>());
        System.out.println("Rahul"+new Integer(77));
        System.out.println(new ArrayList<>()+""+new Integer(88));
    }

}
