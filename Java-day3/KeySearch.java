//import java.util.Scanner;
//public class KeySearch {
//    public static void main(String args[])
//    {
//        Scanner sc=new Scanner(System.in);
//        int ArraySize=sc.nextInt();
//         System.out.println("Enter the array elements");
//       int LengthofArray=sc.nextInt();
//       
//        int array[]=new int[ArraySize];
//        for(int m=0;m<LengthofArray;m++)
//        {
//            array[m]=sc.nextInt();
//        }
//        
//        System.out.println("Enter the Key element to search");
//        int key=sc.nextInt();
//        for(int j=0;j<array.length;j++){
//        for(int i=j+1;i<array.length;i++){
//            
//            if(array[i]==key)
//            {
//                System.out.println("present");
//                
//            }
//            break;
//            
//        }
//        }
//    
//    }
//    
//}

import java.util.Scanner;

public class KeySearch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int arraySize = sc.nextInt();
        System.out.println("Enter the array elements");
        int lengthOfArray = arraySize; // Use arraySize instead of a separate input
       
        int array[] = new int[arraySize];
        for (int m = 0; m < lengthOfArray; m++) {
            array[m] = sc.nextInt();
        }

        System.out.println("Enter the Key element to search");
        int key = sc.nextInt();

        // Use a flag to check if the key is found
        boolean keyFound = false;

        for (int j = 0; j < array.length; j++) {
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] == key) {
                    keyFound = true;
                    //break; // Break out of the inner loop when the key is found
                }
            }
        }

        if (keyFound) {
            System.out.println("Key is present in the array");
        } else {
            System.out.println("Key is not present in the array");
        }
    }
}