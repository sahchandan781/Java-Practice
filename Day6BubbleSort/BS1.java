package Day6BubbleSort;

// Bubble sort || sinking sort || exchange sort
// in every step we are comparing adjacent element
// for eg : ascending order
// 3 1 5 4 2
// 1 3 5 4 2
// 1 3 4 5 2
// 1 3 4 2 5

// space complexity is constant = O(1) aka inplace sorting algo(no neet to create new array)
// time complexity Best case : O(N)  in time complexity constant are ignored
// worst case : O(N*N) sorting in opposite 
// it is the stable sorting algo(order should be same when value is same)



public class BS1 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};

        for( int i = 0; i< arr.length; i++){

            for( int j = i+1; j<arr.length; j++){
                int temp = 0;

                if(arr[j] > arr[i]){

                    // Swaping
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

            System.out.print(arr[i] + " ");
        }
    }
}
