public class AllAboutStrings {
    public static void main(String[] args) {
        String a ="Rahul";
        String b ="Rahul";
        System.out.println(a+"here a is reference variable stored in stack memory with an object Rahul");
        System.out.println(b+"here b is reference variable stored in stack memory with an object Rahul");
        System.out.println("both reference variables are locating same object in stack Memory"+"\n so if any one of the reference variable is modified both reference variables will get effected thus, security issues arise.");
        System.out.println("String pool is a separate memory structure inside a Heap.");
        System.out.println("comparison of  Strings");
        System.out.println(a == b);
        System.out.println(a==b+"as these are concatinated with string whole statment will be considered as a String so the outpout will return false");

        String name1 = new String("virat");
        String name2 = new String("virat");
        System.out.println(name1);
        System.out.println(name2);
        System.out.println("This will return false as it object is not referenced with same variable"+name1==name2);
        System.out.println(name1.equals(name2));
        System.out.println("this will check that String name1 and name2 value are both same or not");

    }
}
