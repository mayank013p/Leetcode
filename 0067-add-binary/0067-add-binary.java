import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger first = new BigInteger(a, 2);
        BigInteger second = new BigInteger(b, 2);
        BigInteger sum = first.add(second);
        return sum.toString(2);
    }
}