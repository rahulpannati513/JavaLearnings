public class ParameterizedConstructor {
    int rno;
    String name;
    double per;
    ParameterizedConstructor(int n , String na, double pe){
        rno = n;
        name = na;
        per = pe;
    }
    void display(){
        System.out.println("\t RollNO : "+rno);
        System.out.println("\t name : "+ name);
        System.out.println("\t RollNO : "+per);
    }

    public static void main(String[] args) {
        ParameterizedConstructor s1 = new ParameterizedConstructor(18 ,"Rahul",99);
        s1.display();

    }
}
