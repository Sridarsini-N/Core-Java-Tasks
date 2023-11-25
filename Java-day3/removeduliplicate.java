public class removeduliplicate {
    public static void main(String[] args) {
        // Sample array with repeated elements
        int[] arr = {1, 2, 3, 4, 2, 3, 5, 6, 7, 7};

        // Remove duplicates in the array
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If a duplicate is found, replace it with the last element
                if (arr[i] == arr[j]) {
                    arr[j] = arr[n - 1];
                    n--;
                    j--;
                }
            }
        }

        // Print the unique elements
        System.out.println("Unique Elements:");
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }
    }
    
}
