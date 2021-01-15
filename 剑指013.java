class Solution {
    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(m,n,k,0,0,visited);
    }
    private int dfs(int m,int n,int k,int i,int j,boolean[][] visited){ //注意这里的格式[][]
        if(i<0 || j<0 || i>=m || j>=n || (i/10+i%10+j/10+j%10)>k || visited[i][j])
            return 0; //越界，和>k，已访问返回false
        visited[i][j]=true;
        return dfs(m,n,k,i+1,j,visited) + dfs(m,n,k,i-1,j,visited) +
               dfs(m,n,k,i,j+1,visited) + dfs(m,n,k,i,j-1,visited) + 1; //不像1762题，这里返回的是有多少个位置，所以是+，函数类型为int
               //且不用将visited的归0
    }
}
