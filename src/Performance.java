public interface Performance {
    public static void main(String[] args) {
        String series ="";
        for(int i =0 ;i<26;i++){
            char ch = (char)('a'+i);
            series = series+ch;
        }
        System.out.println(series);
        //here the performance of this series is 0(n)2
        // every time the new object is create and space is wasted new referenced variable is attached to new object
        //space is wasted and unrefferenced variables are there and to avoid this we use StringBuilder
        //In which Stringbuilder is creates only one object and every time new data is added it will attach to its same referenced objected

    }
}
