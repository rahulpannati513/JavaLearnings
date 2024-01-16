package arraydsa;

public class LinearSearch {
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,7,8,9};
        int n = 5;
        System.out.println(iselement(arr,n));
    }

    static boolean iselement(int[] arr,int n) {
        for(int i =0; i<arr.length;i++)
        {
            if (arr[i]== n)
                return true;
        }
        return false;
    }


}
