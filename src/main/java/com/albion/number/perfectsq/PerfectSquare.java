package com.albion.number.perfectsq;

public class PerfectSquare {
	public boolean isPerfectSquare(int num) {
        for(int i = 1; i <= num/i; ++i){
            if(i*i == num)
                return true;
        }
        return false;
    }
}
