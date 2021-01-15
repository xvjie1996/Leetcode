public class Solution {
    // you need to treat n as an unsigned value //无符号表明是正数
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0){
            res += n & 1; //只二进制最右一位比较，n&1=0，说明最右一位是0
            n >>>= 1;  //无符号右移专用>>>
        }
        return res;
    }
}
