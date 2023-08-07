public class Task16 {
    public static void binarySearch(int[] arr, int first, int last, int key) {
        int mid = (last+first) /2;

        while(first <= last) {
            if (arr[mid] < key) {
                first = mid+1;
            } else if (arr[mid] == key) {
                System.out.println("In "+mid+" this index, our key is found");
                break;
            }
            else {
                last = mid-1;
            }

            mid = (last+first)/2;
        }
        if (first > last)
            System.out.println("Key is not found");
    }

    private static void binarySearch2(int[] userInputList, int target, int low, int high) {

        int midIndex = (low + high)/2;

        while (low <= high) {
            if (target == userInputList[midIndex]) {
                System.out.println("Target value is find in this " + midIndex + " index");
                break;
            }
            else if (target > userInputList[midIndex]) {
                low = midIndex+1;
            }
            else {
                high = midIndex-1;
            }

            midIndex = (high+low)/2;
        }
        if (low > high) {
            System.out.println("Target value(" + target + ") is not find in list");
        }
    }
}
