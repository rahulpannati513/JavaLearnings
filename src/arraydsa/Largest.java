package arraydsa;

public class Largest {

    public static void main(String[] args) {
        int arr[] = {2,5,4,9,7};
        int arr2[] = {5,3,2,6,7,3,1};
        System.out.println("largest element in a array is:"+findLargestElement(arr));
        System.out.println("largest element in a array is:"+findLargestElement(arr2));

    }
    static int findLargestElement(int arr[]){
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;
    }
}
