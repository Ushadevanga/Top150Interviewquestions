class Solution {
    public void gameOfLife(int[][] board) {
       int n=board.length;
       int m=board[0].length;
       for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            int live=0;
            if(j+1<m && Math.abs(board[i][j+1])==1){
                live++;
            }
            if(i+1<n && Math.abs(board[i+1][j])==1){
                live++;
            }
            if(j-1>=0 && Math.abs(board[i][j-1])==1){
                live++;
            }
            if(i-1>=0 && Math.abs(board[i-1][j])==1){
                live++;
            }
            if(i+1<n && j+1<m && Math.abs(board[i+1][j+1])==1){
                live++;
            }
            if(i+1<n && j-1>=0 && Math.abs(board[i+1][j-1])==1){
                live++;
            }
            if(i-1>=0 && j+1<m && Math.abs(board[i-1][j+1])==1){
                live++;
            }
            if(i-1>=0 && j-1>=0 && Math.abs(board[i-1][j-1])==1){
                live++;
            }
            if(board[i][j]==1){
                if(live<2){
                    board[i][j]=-1;
                }else if(live==2 || live==3){
                    board[i][j]=1;
                }else if(live>3){
                    board[i][j]=-1;
                }
                }
                else if(board[i][j]==0 && live==3){
                    board[i][j]=-2;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(board[i][j]==-2){
                    board[i][j]=1;
                }else if(board[i][j]==-1){
                    board[i][j]=0;
                }
            }
        }
       }
    }
