//数学推导法
//推论：每份尽量一样大，乘积会大些，因为算数平均不等式，各项相等时取等号取最大值;每段长度为3效果更好，因为这样最后一段可能0，1，2，才可能最大
//时间空间o1
class Solution {
    public int cuttingRope(int n) {
        if(n<=3)return n-1;
        int a = n/3,b = n%3;
        if(b==0)return (int)Math.pow(3,a);
        else if(b==1)return (int)Math.pow(3,a-1)*4; //33322
        else return (int)Math.pow(3,a)*2;  //3332
    }
}
