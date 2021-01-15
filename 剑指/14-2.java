class Solution {
    public int cuttingRope(int n) {
        if(n==2)return 1;
        int res = 0;
        for(int i=2;i<n;i++){
            res = Math.max(res,Math.max(i*cuttingRope(n-i),i*(n-i))); //先比较当前乘积和继续剪下去的乘积，再与之前的res打擂台比较
        }
        return res;
    }
} //结果超时，因为没有记录已经算好的记录，加入备忘录，用空间换时间。


class Solution {
    public int cuttingRope(int n) {
        int[] memo = new int[n+1];
        memo[2]=1;
        return V(memo,n);
    }

    private int V(int[] memo,int n){
        if(memo[n] != 0)return memo[n]; //备忘录中有记录，直接返回算好的结果
        int res = 0;
        for(int i=2;i<n;i++){
            res = Math.max(res , Math.max(i*V(memo,n-i) , i*(n-i)));
        }
        memo[n]=res;
        return res;
    }
} 
