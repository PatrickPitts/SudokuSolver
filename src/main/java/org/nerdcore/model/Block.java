package org.nerdcore.model;

public class Block {
    Integer[][] nums;
    int limit, R, C;

    Block(int R, int C){
        this.nums = new Integer[R][C];
        this.R = R; this.C = C;
        this.limit = R*C;
    }

    Block(Integer[][] nums){
        this(nums.length,nums[0].length);
        this.nums = nums;
    }

    boolean set(int R, int C, int N){
        if(this.R < R || this.C < C)return false;
        if(nums[R][C] != null && nums[R][C] > 0)return false;
        nums[R][C] = N;
        return true;
    }

    Integer[][] getGrid(){
        return nums;
    }

    Integer[] getRow(int r){
        return nums[r];
    }

    Integer[] getCol(int c){
        Integer[] ret = new Integer[R];
        int i = 0;
        for(Integer[] row : nums){
            ret[i++] = row[c];
        }
        return ret;
    }

    void clear(int r, int c){
        nums[r][c] = null;
    }

}
