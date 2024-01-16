public class Student {
    public static void main(String[] args) {
        // Example program for class and Object
        Student s1 = new Student();
        Student s2 = new Student();
        s1.insertRecord(18,"Rahul");
        s2.insertRecord(19,"virat");
        s1.displayInformation();
        s2.displayInformation();

    }
    int rollno;
    String name;
    void insertRecord(int r,String n){
        rollno = r;
        name = n;

    }
    void displayInformation(){
        System.out.println("RollNO: "+rollno+" \n"+"Name : "+name);
    }


}
