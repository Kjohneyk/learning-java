

public class User {

    public static int findMaxDistance(int[] arr) {
        int maxDistance = 0;
        int maxIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            int next = i+1;
            int distance = Math.abs(arr[next] - arr[i]);
            if (distance > maxDistance) {
                maxDistance = distance;
                if (arr[i] > arr[next]) {
                    maxIndex = i;
                }else{
                    maxDistance = next;
                }
            }
        }
        return maxIndex;
    }

}
