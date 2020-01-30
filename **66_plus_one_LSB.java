Given a non-empty array of digits representing a non-negative integer, plus one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:

Input: [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Example 2:

Input: [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.


class Solution {
    public int[] plusOne(int[] digits) {
        
        int len = digits.length;
        
        for(int i=len-1; i>=0; i--)
        {
            if(digits[i] == 9) //check if it has carry as 10
            {
                digits[i] = 0; //set LSB to 0
            }
            else{
                digits[i]++; //increment LSB if not '9'
                return digits; //result found
            }
        }
        
        if(digits[0] == 0){ //for input like 999, MSB is 1000
            int resultArray [] = new int[len+1]; // creating new array for one extra bit
            resultArray[0] = 1; //set MSB to 1
            return resultArray; // rest of the bits are 0 by default
            
        }
        return digits;
        
    }
}
