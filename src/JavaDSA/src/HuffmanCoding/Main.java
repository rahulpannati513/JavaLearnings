package HuffmanCoding;

class Main {
    public static void main(String[] args) throws Exception{
        String str = "Rahul is a good boy ";
        hc hf = new hc(str);
        String cs = hf.encode(str);
        System.out.println(cs);
        String dc = hf.decode(cs);
        System.out.println(dc);


    }
}