//finding max and min in a linearsearch
public  class findMin {
    public static void main(String[] args){
        int arr[] ={2,3,2,44,23,45,12,554,12,2,0,-3};
       int minValue= min(arr);
        System.out.println(minValue);
        int maxValue= max(arr);
        System.out.println(maxValue);

    }
    // for finding minimumNumber in  a linearSearch
    static int min(int arr[]){
        int ans = arr[0];
        for (int i = 1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];

            }
        }
        return ans;
    }
    static int max(int arr[]){
        int ans = arr[0];
        for(int i =0; i<arr.length;i++){
            if (arr[i]>ans){
                ans = arr[i];

            }
        }
        return ans;
    }


}