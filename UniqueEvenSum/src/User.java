public class User {

    public static int addUniqueEven(int[] arr) {

        int arr1[] = new int[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (arr[i] == arr1[j]) {
                    break;
                }
                arr1[i] = arr[i];
            }
        }

        int evenSum = 0;
        for (int i = 0; i < arr1.length;i++) {
            if (arr[i]%2 == 0) {
                evenSum += arr1[i];
            }
        }

        if (evenSum == 0) {
            return -1;
        } else {
            return evenSum; 
        }
        
    }
    
}
