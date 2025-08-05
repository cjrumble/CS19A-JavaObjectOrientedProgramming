/* Write a recursive, int-valued method named productOfOdds that accepts an integer array, and the number of elements in the array and returns the product of the positive odd-valued elements of the array. 

You may assume the array has at least one positive odd-valued element. 

The product of the odd-valued elements of an integer-valued array recursively may be calculated as follows:
If the array has a single element and it is odd, then return the value of that element, otherwise return 1.
Otherwise, if the first element of the array is odd, return the product of that element and the result of finding the product of the odd elements of the rest of the array; if the first element is NOT odd, simply return the result of finding the product of the odd elements of the rest of the array.
*/

public class ProductOfOdds {
    public static int productOfOdds(int[] arr, int n) {
        // Base case: if there's only one element
        if (n == 1) {
            return (arr[0] % 2 != 0 && arr[0] > 0) ? arr[0] : 1;
        }

        // Recursive case: check the first element
        if (arr[0] % 2 != 0 && arr[0] > 0) {
            return arr[0] * productOfOdds(arr, n - 1);
        } else {
            return productOfOdds(arr, n - 1);
        }
    }
}
