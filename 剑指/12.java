class Solution {
    public boolean exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        //System.out.println(words);
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){ 
            for(int j=0;j<n;j++){
                if(dfs(board,words,i,j,0,visited)) return true;
            }
        }
        return false;
    }
    boolean dfs(char[][] board,char[] word,int i,int j,int k,boolean[][] visited){
        if(i >= board.length || i<0 || j >= board[0].length || j<0 || board[i][j] != word[k] || visited[i][j])
            return false; //越界，不符条件，已访问的return false，其中已访问的直接修改为空
        if(k==word.length-1)return true;

        visited[i][j]=true; //先设置为true
        boolean res = dfs(board,word,i+1,j,k+1,visited) || dfs(board,word,i-1,j,k+1,visited) || 
                      dfs(board,word,i,j+1,k+1,visited) || dfs(board,word,i,j-1,k+1,visited);
        visited[i][j]=false; //再设置为false，此方法需要使用到额外的空间
        return res;
    }
}
