
// // import java.util.*;

// // public class I_CountAndPrint {
// //     public static void main(String[] args) {
// //         String s = "indianii";
// //         int count = 0;
// //         int middleIndex = -1; 
        
// //         char[] arr = s.toCharArray();
        
// //         for (int i = 0; i < arr.length; i++) {
// //             if (arr[i] == 'i') {
// //                 count++;
// //                 if (count == 2) {
// //                     middleIndex = i;
                    
// //                 }
// //             }
// //         }
        
// //         if (middleIndex != -1) {
// //             System.out.println("The index of the middle 'i' is: " + middleIndex);
// //         } else {
// //             System.out.println("'i' does not occur twice in the string.");
// //         }
// //     }
// // }



// import java.util.*;

// public class I_CountAndPrint {
//     public static void main(String[] args) {
//         String s = "i am indian ethical singer";
//         char target = 'i';
//         int count = 0;

        
//         for (char c : s.toCharArray()) {
//             if (c == target) {
//                 count++;
//             }
//         }

//         // Determine the middle index (1-based position of the middle 'i')
//         int middlePosition = (count % 2 == 0) ? (count / 2) : ((count / 2) + 1);
        
//         // Find the index of the middle 'i' in the string
//         count = 0;
//         int middleIndex = -1;
//         for (int i = 0; i < s.length(); i++) {
//             if (s.charAt(i) == target) {
//                 count++;
//                 if (count == middlePosition) {
//                     middleIndex = i;
//                     break;
//                 }
//             }
//         }

//         // Print the result
//         if (middleIndex != -1) {
//             System.out.println("The index of the middle 'i' is: " + middleIndex);
//         } else {
//             System.out.println("The character 'i' does not occur enough times in the string.");
//         }
//     }
// }


public class I_CountAndPrint {
    public static void main(String[] args) {
        String s = "i am indian ethical singer";
        char target = 'i';

        int count = 0, middleIndex = -1;

        // First pass: Count occurrences of 'i'
        for (char c : s.toCharArray()) {
            if (c == target) {
                count++;
            }
        }

        // Calculate the middle position (1-based)
        int middlePosition = (count + 1) / 2; // Handles both even and odd counts

        // Second pass: Find the index of the middle 'i'
        count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
                if (count == middlePosition) {
                    middleIndex = i;
                    break;
                }
            }
        }

        // Print the result
        System.out.println("The index of the middle 'i' is: " + middleIndex);
    }
}
