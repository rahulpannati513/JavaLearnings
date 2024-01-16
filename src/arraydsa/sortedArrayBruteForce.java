package arraydsa;

public class sortedArrayBruteForce {
    public static void main(String[] args) {
        int arr1[] = {1,2,4,5,7,8};

        System.out.println("sorted :"+sorted(arr1));
    }
    static boolean sorted(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    return false;
                }

            }


        }
        return true;
    }
}
