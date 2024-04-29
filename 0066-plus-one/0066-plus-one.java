import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
        BigInteger ans = BigInteger.ZERO;
        for (int i = 0; i < digits.length; i++) {
            ans = ans.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
        }
        ans = ans.add(BigInteger.ONE);

        String result = String.valueOf(ans);

        int[] finalArray = new int[result.length()];
        for(int j = 0; j<result.length();j++){
            finalArray[j] = Character.getNumericValue(result.charAt(j));
        }
        return finalArray;
    }
}