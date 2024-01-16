package arraydsa.basics;

import com.sun.security.jgss.GSSUtil;

public class SearchInStrings {
    public static void main(String[] args) {
        String s = "rahul";
        char target = 'a';
        System.out.println( search(s,target));
    }
    static boolean search(String s,int target){
        for (int i = 0; i < s.length(); i++) {
            if(target == s.charAt(i)){
                return  true;
            }

        }
        return false;
    }
}
