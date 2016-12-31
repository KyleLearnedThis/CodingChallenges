package com.albion.arrayrotate;

import org.testng.annotations.Test;

public class ArrayRotateTest {

  @Test
  public void rotate() {
    int[] nums = {1,2,3,4,5,6,7};
    int k = 3;
    int[] expected = {5,6,7,1,2,3,4};
    ArrayRotate a = new ArrayRotate();
    a.rotate(nums, k);
    for(int x : nums){
    	System.out.println("blah: " + x);
    }
  }
}
