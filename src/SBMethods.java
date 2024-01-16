import java.util.Arrays;

public class SBMethods {
    public static void main(String[] args) {
        String name = "Kunal Kushwaha";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('a'));
        System.out.println(name.strip());
        System.out.println(name.charAt(3));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
