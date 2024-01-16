public class Test {
    static class Example{
        int x = 10;
        int y = 20;
    }
public static void main(String[] args){
    // primitive variables
    int p = 50;
    int q =m1();
    //referenced variables
    String s1 = "abc";
    String s2 = "xyz";
    Example e = new Example();
    System.out.println("e object address "+e);
    System.out.println("int q value is : "+q+"\nint p value is : "+p);

}
static int m1(){
    return 60;
}
}
