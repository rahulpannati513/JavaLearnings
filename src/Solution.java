public class Solution {
    public static void  main(String[] args) {
        System.out.println(interpret("G()()()()(al)"));

    }
    public static String interpret(String c) {
        StringBuilder st = new StringBuilder();
        for(int i =0; i<c.length(); i++)
        {
            if(c.charAt(i) == 'G')
                st.append("G");
            else
            {
                if(c.charAt(i+1) == ')' )
                {
                    st.append("o");
                    i++;
                }
                else
                {
                    st.append("al");
                    i = i+3;
                }
            }
        }
        return st.toString();
    }

}
