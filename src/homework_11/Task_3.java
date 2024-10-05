package homework_11;

public class Task_3 {
    public static void main(String[] args) {
        int [] arr = {5, 8, 9, 10, 9, 8, 5};
        System.out.println(arr.length);
        System.out.println(isPalindrome(arr));
    }
    public static boolean isPalindrome (int[] arr){
        if(arr == null || arr.length == 0){
            return false;
        }

        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            if(arr[i] != arr[n-1 - i]) {
                return false;
            }
        }
        return true;
    }
}
