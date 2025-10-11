package Arrays;

public class Day1Arrays {
    static void Reverse(int [] arr){
        int left = 0; // index starting at the first index
        int right = arr.length - 1; //index starting at the last index
        while(left < right){ //while loop with condition, breaks when left is greater than right
            int temp = arr[left]; //create a temp variable and set it to the first index
            arr[left] = arr[right]; //the right value is now in the left index position
            arr[right] = temp;// now the right index has the left value position
            left++; //left goes up by one
            right--; //right  goed down by one
        }
    }

    public static void rotate(int[] arr, int k) {
        int n = arr.length;
        //k is number of elements we want switched
        k = k % n; // handle if k > n //number of steps
        reversePart(arr, 0, n - 1);// so here we pass our array and first index + last index
        reversePart(arr, 0, k - 1);// here we pass arr and first index + k-1, which is index for number of elements we want switched
        //int[] arr = [1,2,3,4,5,6,7]
        //example: lets say we want it rotated by 3 elements, k = 3 % 7 = 3
        //so k-1: 3-1=2. so we would give index left = 0, right = 2 to reverse
        reversePart(arr, k, n - 1); // here we reverse the remaining numbers left, so left = 2, and right = 6
    }

    private static void reversePart(int[] arr, int left, int right){ //same reverse array function but this time we pass the indexes
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public static int findMax(int[] arr){
        int max = arr[0];
        for (int num : arr){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
    public static int findMin(int[] arr){
        int min = arr[0];
        for(int num: arr){
            if(num < min){
                min = num;
            }
        }
        return min;
    }

    public static int LinearSearch(int[] arr, int target){
        for(int i =0; i< arr.length; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }



    public static int BinarySearch (int [] arr,int target){
        int left =0;//index starting at the beginning
        int right = arr.length-1; // index at the end
        while(left <= right){ // we want condition to check every number
            int mid = left + (right-left)/2; // find mid index, (right-left)/2 finds half index. +left so we dont keep starting at first index
            if(arr[mid] == target){
                return mid;
            }else if (arr[mid] < target) { //if our value in mid is less than target
                left = mid +1;// we move index up by one and redo mid formula
            }else {// if our value in mid is less than target
                right = mid - 1;//we move index down by one and redo mid formula
            }
        }
        return -1;// this means loop finishes and didnt find target
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};

        Reverse(nums);
        System.out.println("Reversed: " + java.util.Arrays.toString(nums));

        rotate(nums,2);
        System.out.println("Rotated: " + java.util.Arrays.toString(nums));


        System.out.println("Max: " + findMax(nums));
        System.out.println("Mix: " + findMin(nums));

        System.out.println(" Linear Search 3: " + LinearSearch(nums, 3));
        int[] sortedA = {1,2,3,4,5,6,7};
        System.out.println(" Binary Search 4: " + BinarySearch(sortedA,4));

    }



}