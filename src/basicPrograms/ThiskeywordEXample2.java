public class ThiskeywordEXample2 {
void display(){
    System.out.println("clas level reference: "+ this);
    }

    public static void main(String[] args) {
    ThiskeywordEXample2 sv1 =new ThiskeywordEXample2();
        System.out.println("sv1 reference: "+sv1);
    sv1.display();
        ThiskeywordEXample2 sv2 = new ThiskeywordEXample2();
        System.out.println("sv2 reference: "+sv2);
        sv2.display();

    }


}
