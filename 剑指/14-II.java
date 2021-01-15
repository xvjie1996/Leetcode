//本题比上题在于，大数越界下的求余问题。
//循环取余法。
class Solution {
    public int cuttingRope(int n) {
        if(n<=3)return n-1;
        long res = 1L;  //long型的1，前面有long，后面就要加L
        int p = (int)1e9+7; //10^9接近int边界
        while(n>4){ //贪心算法，优先切3，最后切2。n最小是5，最后一个n:2,3,4
            res = res * 3 % p; //上题n最大58，这里到1000，可能会乘的很大，取余
            n -= 3;
        }
        return (int)(res*n%p);
    }
}
